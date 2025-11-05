package be.ucll.observer_stockmarket;

public class InstitutionalInvestor implements Investor {
    private String name;

    public InstitutionalInvestor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockSymbol, double price) {
        System.out.println(name + ": " + stockSymbol + " price updated to " + price);
    }

}
