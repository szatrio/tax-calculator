package com.example.taxcalculator.entity.taxslab;


public class TaxSlab {

    private char category;

    private double[] chargeableIncome;

    private double[] calculations;

    private double rate;

    private double[] tax;

    public TaxSlab(char category, double[] chargeableIncome, double[] calculations, double rate, double[] tax) {
        this.category = category;
        this.chargeableIncome = chargeableIncome;
        this.calculations = calculations;
        this.rate = rate;
        this.tax = tax;
    }

    public char getCategory() {
        return category;
    }

    public void setCategory(char category) {
        this.category = category;
    }

    public double[] getChargeableIncome() {
        return chargeableIncome;
    }

    public void setChargeableIncome(double[] chargeableIncome) {
        this.chargeableIncome = chargeableIncome;
    }

    public double[] getCalculations() {
        return calculations;
    }

    public void setCalculations(double[] calculations) {
        this.calculations = calculations;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public double[] getTax() {
        return tax;
    }

    public void setTax(double[] tax) {
        this.tax = tax;
    }

    @Override
    public String toString() {
        return String.format("TaxSlab(category=%s, rate=%s)", category, rate);
    }
}
