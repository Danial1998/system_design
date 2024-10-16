// User class for buying and selling stocks
import java.util.*;

public class User {
    private String name;
    private Map<Stock, Integer> portfolio = new HashMap<>();
    private List<Watchlist> watchlists = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }

    public void buyStock(Stock stock, int quantity) {
        portfolio.put(stock, portfolio.getOrDefault(stock, 0) + quantity);
    }

    public void sellStock(Stock stock, int quantity) {
        portfolio.put(stock, portfolio.getOrDefault(stock, 0) - quantity);
    }

    public Watchlist createWatchlist(String name) {
        Watchlist watchlist = new Watchlist(name);
        watchlists.add(watchlist);
        return watchlist;
    }

    public void addToWatchlist(Watchlist watchlist, Stock stock) {
        watchlist.addStock(stock);
        System.out.println(stock.getSymbol() + " added to watchlist '" + watchlist.getName() + "'");
    }
}