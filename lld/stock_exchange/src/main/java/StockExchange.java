import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

// StockExchange class to update stock prices
public class StockExchange {
    private Map<String, Stock> stocks = new HashMap<>();

    public void addStock(Stock stock) {
        stocks.put(stock.getSymbol(), stock);
    }

    public void startUpdatingPrices() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                for (Stock stock : stocks.values()) {
                    double newPrice = Math.random() * 100;  // Simulate new price
                    stock.setPrice(newPrice);
                }
            }
        }, 0, 2000);  // Update every 2 seconds
    }
}