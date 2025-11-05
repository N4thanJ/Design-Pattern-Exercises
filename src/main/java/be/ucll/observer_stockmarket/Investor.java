package be.ucll.observer_stockmarket;

public interface Investor {
    void update(String stockSymbol, double price);
}
