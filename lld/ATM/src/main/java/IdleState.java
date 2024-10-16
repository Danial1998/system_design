public class IdleState implements State {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card inserted. Please enter your PIN.");
        atm.setState(new HasCardState());
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card to eject.");
    }

    @Override
    public void enterPIN(ATM atm, int pin) {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void requestCash(ATM atm, int amount) {
        System.out.println("Please insert your card first.");
    }
}
