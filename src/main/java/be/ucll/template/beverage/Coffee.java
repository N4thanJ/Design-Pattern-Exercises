package be.ucll.template.beverage;

public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping coffee through filter.");
    }

    @Override
    void addGarnish() {
        System.out.println("Adding sugar and milk.");
    }

}
