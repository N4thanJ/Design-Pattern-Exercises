package be.ucll.pizza_builder;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder().build();

        System.out.println(pizza.toString());
    }

}
