package be.ucll.stockmarket;

public class Main {
    public static void main(String[] args) {
        ConcreteStock concreteStock = new ConcreteStock("AAPL", 5.0);
        Investor investor1 = new IndividualInvestor("Nathan");
        Investor investor2 = new InstitutionalInvestor("Rajo");

        concreteStock.addInvestor(investor1);
        concreteStock.addInvestor(investor2);

        concreteStock.setPrice(4.1);

        concreteStock.removeInvestor(investor1);

        concreteStock.setPrice(5.4);
    }
}