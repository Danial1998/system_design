// Main class to demonstrate the stock brokering system
public class Main {
    public static void main(String[] args) {
        // Create a stock exchange
        StockExchange stockExchange = new StockExchange();

        // Create some stocks
        Stock stock1 = new Stock("AAPL", "Apple", 150.0);
        Stock stock2 = new Stock("GOOGL", "Google", 2800.0);
        Stock stock3 = new Stock("AMZN", "Amazon", 3400.0);

        // Add stocks to the stock exchange
        stockExchange.addStock(stock1);
        stockExchange.addStock(stock2);
        stockExchange.addStock(stock3);

        // Start updating stock prices
        stockExchange.startUpdatingPrices();

        // Create a user
        User user = new User("John Doe");

        // Buy some stocks
        user.buyStock(stock1, 10);
        user.buyStock(stock2, 5);

        // Create watchlists
        Watchlist techWatchlist = user.createWatchlist("Tech Watchlist");

        // Add stocks to watchlist
        user.addToWatchlist(techWatchlist, stock1);
        user.addToWatchlist(techWatchlist, stock2);

        // Wait for a while to see the price updates
        try {
            Thread.sleep(10000);  // Let the system run for 10 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
