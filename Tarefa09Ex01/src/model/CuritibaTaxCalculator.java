package model;

public class CuritibaTaxCalculator implements TaxCalculator {
    @Override
    public double calculateTax(double areaTotal, int[] parameters) {
        double tax = areaTotal * 5;
        int age = parameters[2];
        if (age > 50) {
            tax += age * 3;
        } else if (age < 20) {
            tax += age * 2;
        } else {
            tax += age * 2.5;
        }
        return tax;
    }
}