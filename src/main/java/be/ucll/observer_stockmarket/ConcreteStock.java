package be.ucll.observer_stockmarket;

import java.util.ArrayList;
import java.util.List;

public class ConcreteStock {
    private String stockSymbol;
    private double price;
    private List<Investor> investors = new ArrayList<>();

    public ConcreteStock(String stockSymbol, double price) {
        this.stockSymbol = stockSymbol;
        this.price = price;
    }

    public void addInvestor(Investor investor) {
        if (this.investors.contains(investor)) {
            throw new Error("Investor already subscribed");
        }
        this.investors.add(investor);
    }

    public void removeInvestor(Investor investor) {
        if (!this.investors.contains(investor)) {
            throw new Error("This investor is not subscribed here");
        }
        this.investors.remove(investor);
    }

    public void notifyInvestors() {
        for (Investor i : investors) {
            i.update(stockSymbol, price);
        }
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public void setPrice(double price) {
        this.price = price;
        notifyInvestors();
    }

}
