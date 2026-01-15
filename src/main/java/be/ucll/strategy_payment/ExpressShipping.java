package be.ucll.strategy_payment;

public class ExpressShipping implements ShippingStrategy {

    @Override
    public void calculate(double weight) {
        System.out.println("Express shipping paid: " + (weight * 1.2 + 5.0));
    }

}
