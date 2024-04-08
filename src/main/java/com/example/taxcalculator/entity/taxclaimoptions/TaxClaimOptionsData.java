package com.example.taxcalculator.entity.taxclaimoptions;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TaxClaimOptionsData {

    private List<TaxClaimOptions> taxClaimOptionsList;

    public TaxClaimOptionsData(List<TaxClaimOptions> taxClaimOptionsList) {
        this.taxClaimOptionsList = taxClaimOptionsList;
    }

    public List<TaxClaimOptions> getTaxClaimOptionsList() {

        taxClaimOptionsList = new ArrayList<>();

        taxClaimOptionsList.add(new TaxClaimOptions("Individual and dependent relatives", 9000));
        taxClaimOptionsList.add(new TaxClaimOptions("Medical treatment, special needs and carer expenses for parents (Medical condition certified by medical practitioner)", 8000));
        taxClaimOptionsList.add(new TaxClaimOptions("Purchase of basic supporting equipment for disabled self, spouse, child or parent", 6000));
        taxClaimOptionsList.add(new TaxClaimOptions("Disabled individual", 6000));
        taxClaimOptionsList.add(new TaxClaimOptions("Education fees (Self)", 7000));
        taxClaimOptionsList.add(new TaxClaimOptions("Medical expenses on", 10000));
        taxClaimOptionsList.add(new TaxClaimOptions("Lifestyle – Expenses for the use / benefit of self, spouse or child", 2500));
        taxClaimOptionsList.add(new TaxClaimOptions("Lifestyle – Additional relief for the use / benefit of self, spouse or child", 500));
        taxClaimOptionsList.add(new TaxClaimOptions("Purchase of breastfeeding equipment for own use for a child aged 2 years and below", 1000));
        taxClaimOptionsList.add(new TaxClaimOptions("Child care fees to a registered child care centre / kindergarten for a child aged 6 years and below", 3000));
        taxClaimOptionsList.add(new TaxClaimOptions("Net deposit in Skim Simpanan Pendidikan Nasional", 8000));
        taxClaimOptionsList.add(new TaxClaimOptions("Husband / wife / payment of alimony to former wife", 4000));
        taxClaimOptionsList.add(new TaxClaimOptions("Disabled husband / wife", 5000));
        taxClaimOptionsList.add(new TaxClaimOptions("Each unmarried child and under the age of 18 years old", 2000));
        taxClaimOptionsList.add(new TaxClaimOptions("Each unmarried child of 18 years and above who is receiving full-time education", 2000));
        taxClaimOptionsList.add(new TaxClaimOptions("Each unmarried child of 18 years and above that", 8000));
        taxClaimOptionsList.add(new TaxClaimOptions("Disabled child", 6000));
        taxClaimOptionsList.add(new TaxClaimOptions("Additional exemption of RM8,000 disable child age 18 years old and above", 8000));
        taxClaimOptionsList.add(new TaxClaimOptions("Life insurance and EPF", 7000));
        taxClaimOptionsList.add(new TaxClaimOptions("Deferred Annuity and Private Retirement Scheme", 3000));
        taxClaimOptionsList.add(new TaxClaimOptions("Education and medical insurance", 3000));
        taxClaimOptionsList.add(new TaxClaimOptions("Contribution to the Social Security Organization", 350));
        taxClaimOptionsList.add(new TaxClaimOptions("Expenses on charging facilities for Electric Vehicle", 2500));

        return taxClaimOptionsList;
    }
}
