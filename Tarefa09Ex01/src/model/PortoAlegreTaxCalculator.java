package model;

public class PortoAlegreTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double areaTotal, int[] parameters) {
        if (parameters[1] > 0) {
            return areaTotal * 7.5 + parameters[1] * 2.5;
        } else {
            return areaTotal * 8;
        }
    }
}