import java.util.*;

public class SplitWiseApp {
    private Map<String, User> users;
    private List<Group> groups;

    public SplitWiseApp(){
        this.users = new HashMap<>();
        this.groups = new ArrayList<>();
    }

    public User addUser(String id, String name){
        User user = new User(id,name);
        users.put(id, user);
        return user;
    }

    public Group createGroup(String name){
        Group group = new Group(name);
        groups.add(group);
        return group;
    }

    public void addExpenseToGroup(Group group,double amount, User payer, List<User> participants){
        Expense expense = new Expense(amount,payer,participants);
        group.addExpense(expense);
    }

    public static void main(String[] args) {
        SplitWiseApp app = new SplitWiseApp();

        User danial = app.addUser("1","danial");
        User bikash = app.addUser("2", "bikash");

        Group group = app.createGroup("Friends");
        group.addMember(danial);
        group.addMember(bikash);

        app.addExpenseToGroup(group,120,danial, Arrays.asList(danial,bikash));

        group.showBalances();

    }


}
