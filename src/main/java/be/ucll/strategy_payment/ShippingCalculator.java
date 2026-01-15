package be.ucll.strategy_payment;

public class ShippingCalculator {
    private ShippingStrategy shippingStrategy;

    public ShippingCalculator(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void checkout(double weight) {
        if (shippingStrategy == null) {
            throw new IllegalArgumentException("Onbekende verzendmethode");
        }

        shippingStrategy.calculate(weight);
    }
}