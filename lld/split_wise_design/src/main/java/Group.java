import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Group {
    private String name;
    private List<User> members;

    public Group(String name){
        this.name = name;
        this.members = new ArrayList<>();
    }

    public void addMember(User user){
        members.add(user);
    }

    public void addExpense(Expense expense){
        expense.splitExpense();
    }

    public void showBalances(){
        for(User member:members){
            System.out.println(member.getName()+"s balances:");
            for(Map.Entry<String, Double> entry: member.getBalances().entrySet()){
                System.out.println(" owes "+entry.getKey()+": " + entry.getValue() );
            }
        }
    }

}
