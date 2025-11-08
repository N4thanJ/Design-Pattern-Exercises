package be.ucll.template.beverage;

public class Tea extends CaffeineBeverageWithHook {
    @Override
    void brew() {
        System.out.println("Steeping the tea.");
    }

    @Override
    void addGarnish() {
        System.out.println("Adding lemon.");
    }
}
