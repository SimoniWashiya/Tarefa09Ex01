package model;

public class SaoPauloTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double areaTotal, int[] parameters) {
        return areaTotal * 10 + parameters[0] * 2;
    }
}