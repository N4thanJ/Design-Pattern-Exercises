package be.ucll.strategy_payment;

public class Main {
    public static void main(String[] args) {
        StandardShipping standardShipping = new StandardShipping();
        
        ShippingCalculator calculator = new ShippingCalculator(standardShipping);
        calculator.checkout(5);
    }
}
