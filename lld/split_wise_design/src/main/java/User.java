import java.util.HashMap;
import java.util.Map;

public class User {
    private String name;
    private String id;
    private Map<String, Double> balances;

    public User(String id, String name){
        this.id = id;
        this.name = name;
        this.balances = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Map<String, Double> getBalances() {
        return balances;
    }

    public void updateBalance(String userId, double amount){
        balances.put(userId, balances.getOrDefault(userId,0.0)+amount);
    }
}
