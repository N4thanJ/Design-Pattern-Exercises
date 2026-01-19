package be.ucll.pizza_builder;

public class Pizza {
    private String size;
    private boolean cheese;
    private boolean pepperoni;
    private boolean bacon;

    private Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.cheese = builder.cheese;
        this.pepperoni = builder.pepperoni;
        this.bacon = builder.bacon;
    }

    @Override
    public String toString() {
        return "Pizza size: " + size + " Cheese: " + cheese + " Pepperoni: " + pepperoni + " Bacon: " + bacon;
    }

    static class PizzaBuilder {
        private String size;
        private boolean cheese;
        private boolean pepperoni;
        private boolean bacon;

        public PizzaBuilder size(String size) {
            this.size = size;
            return this;
        }

        public PizzaBuilder cheese(boolean cheese) {
            this.cheese = cheese;
            return this;
        }

        public PizzaBuilder pepperoni(boolean pepperoni) {
            this.pepperoni = pepperoni;
            return this;
        }

        public PizzaBuilder bacon(boolean bacon) {
            this.bacon = bacon;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}
