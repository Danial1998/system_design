public interface State {
    void insertCard(ATM atm);
    void ejectCard(ATM atm);
    void enterPIN(ATM atm, int pin);
    void requestCash(ATM atm, int amount);
}
