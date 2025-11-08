package be.ucll.template.beverage;

public abstract class CaffeineBeverage {
    final void prepareRecipe() {
        boilwater();
        brew();
        pourInCup();
        addGarnish();
    }

    abstract void brew();

    abstract void addGarnish();

    private void boilwater() {
        System.out.println("Boiling water.");
    }

    private void pourInCup() {
        System.out.println("Pouring into cup.");
    }

}
