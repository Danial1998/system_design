public class DispensingCashState implements State {
    @Override
    public void insertCard(ATM atm) {
        System.out.println("Please wait. Dispensing cash.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Please wait. Dispensing cash.");
    }

    @Override
    public void enterPIN(ATM atm, int pin) {
        System.out.println("Please wait. Dispensing cash.");
    }

    @Override
    public void requestCash(ATM atm, int amount) {
        System.out.println("Please wait. Dispensing cash.");
    }
}
