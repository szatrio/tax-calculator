package com.example.taxcalculator.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChargeableIncomeBuilder {

    private double start;

    private Optional<Double> upTo;
}
