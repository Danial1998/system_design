import java.util.ArrayList;
import java.util.List;

// Watchlist class: Observer in Observer Pattern
public class Watchlist {
    private String name;
    private List<Stock> stocks = new ArrayList<>();

    public Watchlist(String name) {
        this.name = name;
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);  // Register itself as an observer
    }

    public void update() {
        System.out.println("Watchlist " + name + " updated.");
        for (Stock stock : stocks) {
            System.out.println("Stock: " + stock.getSymbol() + ", New Price: " + stock.getPrice());
        }
    }

    public String getName() {
        return name;
    }
}