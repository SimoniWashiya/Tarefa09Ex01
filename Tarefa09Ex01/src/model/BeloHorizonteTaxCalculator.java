package model;

public class BeloHorizonteTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double areaTotal, int[] parameters) {
        return areaTotal * 7 + parameters[0] * 4;
    }
}