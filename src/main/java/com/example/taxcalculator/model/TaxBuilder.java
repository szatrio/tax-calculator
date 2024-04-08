package com.example.taxcalculator.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaxBuilder {

    private double calculations;

    private double taxRate;

    private double tax;
}
