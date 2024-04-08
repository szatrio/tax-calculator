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
public class TaxSlabCalculationsBuilder {

    private TaxBuilder first;

    private Optional<TaxBuilder> next;
}
