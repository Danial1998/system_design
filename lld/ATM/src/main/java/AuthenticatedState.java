public class AuthenticatedState implements State {
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
        System.out.println("PIN already verified.");
    }

    @Override
    public void requestCash(ATM atm, int amount) {
        if (atm.getBalance() >= amount) {
            System.out.println("Dispensing $" + amount);
            atm.deductBalance(amount);
            atm.setState(new DispensingCashState());
        } else {
            System.out.println("Insufficient balance.");
            atm.setState(new IdleState());
        }
    }
}
