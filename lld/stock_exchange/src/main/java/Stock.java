import java.util.ArrayList;
import java.util.List;

// Stock class: Subject in Observer Pattern
public class Stock {
    private String symbol;
    private String name;
    private double price;
    private List<Watchlist> observers = new ArrayList<>();

    public Stock(String symbol, String name, double initialPrice) {
        this.symbol = symbol;
        this.name = name;
        this.price = initialPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
        notifyObservers();
    }

    public void addObserver(Watchlist watchlist) {
        observers.add(watchlist);
    }

    private void notifyObservers() {
        for (Watchlist watchlist : observers) {
            watchlist.update();
        }
    }

    public String getSymbol() {
        return symbol;
    }
}