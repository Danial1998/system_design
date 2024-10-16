public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM(500);  // Initial balance of the ATM machine

        atm.insertCard();         // Insert card
        atm.enterPIN(1234);       // Enter correct PIN
        atm.requestCash(200);     // Withdraw $200
        atm.ejectCard();          // Eject card

        // Try incorrect PIN
        atm.insertCard();         // Insert card
        atm.enterPIN(1111);       // Enter incorrect PIN
        atm.requestCash(100);     // This should not work
    }
}
