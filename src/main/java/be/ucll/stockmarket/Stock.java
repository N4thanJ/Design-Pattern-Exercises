package be.ucll.stockmarket;

public interface Stock {
    void addInvestor(Investor investor);

    void removeInvestor(Investor investor);

    void notifyInvestors();
}
