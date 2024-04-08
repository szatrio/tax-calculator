package com.example.taxcalculator.controller;

import com.example.taxcalculator.model.TaxCalculateResponse;
import com.example.taxcalculator.model.WebResponse;
import com.example.taxcalculator.service.TaxCalculateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaxCalculateController {

    private final TaxCalculateService taxCalculateService;

    @Autowired
    public TaxCalculateController(TaxCalculateService taxCalculateService) {
        this.taxCalculateService = taxCalculateService;
    }

    @GetMapping(
            path = "/api/tax",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public WebResponse<TaxCalculateResponse> calculateTax(@RequestParam(value = "annualIncome") double annualIncome){

        TaxCalculateResponse taxCalculateResponse = taxCalculateService.calculateTax(annualIncome);
        return WebResponse.<TaxCalculateResponse>builder()
                .data(taxCalculateResponse)
                .build();
    }

}
