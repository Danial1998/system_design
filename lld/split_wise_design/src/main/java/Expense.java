import java.util.List;

public class Expense {
    private double amount;
    private User payer;
    private List<User> participants;

    public Expense(double amount, User payer, List<User> participants){
        this.amount = amount;
        this.payer = payer;
        this.participants = participants;
    }

    public void splitExpense(){
        double share = amount/participants.size();
        for(User participant:participants){
            if(!participant.getId().equals(payer.getId())){
                participant.updateBalance(payer.getId(), -share);
                payer.updateBalance(participant.getId(), share);
            }
        }
    }


}
