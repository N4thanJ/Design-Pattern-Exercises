package be.ucll.strategy_payment;

public class StandardShipping implements ShippingStrategy {
    @Override
    public void calculate(double weight) {
        System.out.println("Standard shipping paid: " + (weight * 0.5));
    }
}
