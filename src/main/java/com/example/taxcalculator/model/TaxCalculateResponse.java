package com.example.taxcalculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaxCalculateResponse {

    private double taxAmount;

    private TaxSlabBuilder taxSlab;

    private List<TaxClaimOptionsBuilder> taxClaimOptions;
}
