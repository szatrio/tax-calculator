package com.example.taxcalculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaxSlabBuilder {

    private char category;

    private ChargeableIncomeBuilder chargeableIncome;

    private TaxSlabCalculationsBuilder taxSlabCalculations;
}
