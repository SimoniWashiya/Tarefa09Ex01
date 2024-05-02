package model;

public class TaxContext {
    private TaxCalculator calculator;

    public TaxContext(String city) {
        switch (city) {
            case "SaoPaulo":
                calculator = new SaoPauloTaxCalculator();
                break;
            case "BeloHorizonte":
                calculator = new BeloHorizonteTaxCalculator();
                break;
            case "PortoAlegre":
                calculator = new PortoAlegreTaxCalculator();
                break;
            case "Curitiba":
                calculator = new CuritibaTaxCalculator();
                break;
            default:
                throw new IllegalArgumentException("City not supported");
        }
    }

    public double calculateTax(double areaTotal, int[] parameters) {
        return calculator.calculateTax(areaTotal, parameters);
    }
}