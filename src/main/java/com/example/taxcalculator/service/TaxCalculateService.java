package com.example.taxcalculator.service;

import com.example.taxcalculator.entity.taxclaimoptions.TaxClaimOptions;
import com.example.taxcalculator.entity.taxclaimoptions.TaxClaimOptionsData;
import com.example.taxcalculator.entity.taxslab.TaxSlab;
import com.example.taxcalculator.entity.taxslab.TaxSlabData;
import com.example.taxcalculator.model.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static java.lang.System.out;

@Slf4j
@Service
public class TaxCalculateService {

    @Autowired
    private TaxClaimOptionsData taxClaimOptionsData;

    @Autowired
    private TaxSlabData taxSlabData;

    public TaxCalculateResponse calculateTax(double annualIncome){

        double taxAmount;
        TaxBuilder first;
        TaxBuilder next = null;
        double start;
        Optional<Double> upTo = null;
        TaxSlab selectedTaxSlab = taxSlabData.getTaxSlabList().get(0);

        for ( TaxSlab taxSlab : taxSlabData.getTaxSlabList()) {
            boolean betweenIncome = annualIncome > taxSlab.getChargeableIncome()[0] && annualIncome <= taxSlab.getChargeableIncome()[1];
            boolean highestIncome = annualIncome >= taxSlab.getChargeableIncome()[0] && annualIncome >= taxSlab.getChargeableIncome()[1];
            if(betweenIncome || highestIncome){
                selectedTaxSlab = taxSlab;
            }
        }

        log.info(selectedTaxSlab.toString());

        taxAmount = selectedTaxSlab.getTax()[0] + selectedTaxSlab.getTax()[1];

        first = TaxBuilder.builder()
                .calculations(selectedTaxSlab.getCalculations()[0])
                .tax(selectedTaxSlab.getTax()[0])
                .build();

        start = selectedTaxSlab.getChargeableIncome()[0];

        if(selectedTaxSlab.getCategory() != 'J'){
            upTo = Optional.of(selectedTaxSlab.getChargeableIncome()[1]);
            if(selectedTaxSlab.getCategory() != 'A'){
                next = TaxBuilder.builder()
                        .calculations(selectedTaxSlab.getCalculations()[1])
                        .taxRate(selectedTaxSlab.getRate())
                        .tax(selectedTaxSlab.getTax()[1])
                        .build();
            }
        }

        ChargeableIncomeBuilder chargeableIncomeBuilder = ChargeableIncomeBuilder.builder()
                .start(start)
                .upTo(upTo)
                .build();

        TaxSlabCalculationsBuilder taxSlabCalculationsBuilder = TaxSlabCalculationsBuilder.builder()
                .first(first)
                .next(Optional.ofNullable(next))
                .build();

        TaxSlabBuilder taxSlabBuilder = TaxSlabBuilder.builder()
                .category(selectedTaxSlab.getCategory())
                .chargeableIncome(chargeableIncomeBuilder)
                .taxSlabCalculations(taxSlabCalculationsBuilder)
                .build();


        List<TaxClaimOptionsBuilder>  taxClaimOptionsBuilderList= new ArrayList<TaxClaimOptionsBuilder>();

        for(TaxClaimOptions taxClaimOptions : taxClaimOptionsData.getTaxClaimOptionsList()){
            TaxClaimOptionsBuilder taxClaimOptionsBuilder = TaxClaimOptionsBuilder.builder()
                    .amount(taxClaimOptions.getAmount())
                    .individualReliefType(taxClaimOptions.getIndividualReliefTypes())
                    .build();

            taxClaimOptionsBuilderList.add(taxClaimOptionsBuilder);
        }

        return TaxCalculateResponse.builder()
                .taxAmount(taxAmount)
                .taxSlab(taxSlabBuilder)
                .taxClaimOptions(taxClaimOptionsBuilderList)
                .build();
    };
}
