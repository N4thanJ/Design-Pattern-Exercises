package be.ucll.strategy_payment;

public class InternationalShipping implements ShippingStrategy {

    @Override
    public void calculate(double weight) {
        System.out.println("International shipping paid: " + (weight * 2.5 + 20.0));
    }

}
