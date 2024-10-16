public class ATM {
    private State state;
    private int balance;
    private final int userPIN = 1234;  // Simulating a fixed PIN for simplicity

    public ATM(int initialBalance) {
        this.state = new IdleState();
        this.balance = initialBalance;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertCard() {
        state.insertCard(this);
    }

    public void ejectCard() {
        state.ejectCard(this);
    }

    public void enterPIN(int pin) {
        state.enterPIN(this, pin);
    }

    public void requestCash(int amount) {
        state.requestCash(this, amount);
    }

    public boolean verifyPIN(int pin) {
        return pin == userPIN;
    }

    public int getBalance() {
        return balance;
    }

    public void deductBalance(int amount) {
        if (balance >= amount) {
            balance -= amount;
        }
    }
}
