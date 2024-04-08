package com.example.taxcalculator.entity.taxclaimoptions;

public class TaxClaimOptions {

    private String individualReliefTypes;

    private double amount;

    public TaxClaimOptions(String individualReliefTypes, double amount) {
        this.individualReliefTypes = individualReliefTypes;
        this.amount = amount;
    }

    public String getIndividualReliefTypes() {
        return individualReliefTypes;
    }

    public void setIndividualReliefTypes(String individualReliefTypes) {
        this.individualReliefTypes = individualReliefTypes;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }


    @Override
    public String toString() {
        return String.format("TaxClaimOptions(amount=%s,  individualReliefTypes=%s)", amount, individualReliefTypes);
    }
}
