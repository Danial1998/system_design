public class HasCardState implements State {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("A card is already inserted.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.setState(new IdleState());
    }

    @Override
    public void enterPIN(ATM atm, int pin) {
        if (atm.verifyPIN(pin)) {
            System.out.println("PIN verified. You can now request cash.");
            atm.setState(new AuthenticatedState());
        } else {
            System.out.println("Incorrect PIN. Try again.");
            atm.setState(new HasCardState());
        }
    }

    @Override
    public void requestCash(ATM atm, int amount) {
        System.out.println("Please enter your PIN first.");
    }
}
