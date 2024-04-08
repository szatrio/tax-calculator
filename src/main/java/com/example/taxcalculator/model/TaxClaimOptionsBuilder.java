package com.example.taxcalculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TaxClaimOptionsBuilder {

    private double amount;

    private String individualReliefType;
}
