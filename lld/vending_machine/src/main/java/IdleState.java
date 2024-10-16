public class IdleState implements State {
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Money inserted: " + amount);
        machine.setState(new HasMoneyState());
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Insert money first.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Insert money first.");
    }

    @Override
    public void refundMoney(VendingMachine machine) {
        System.out.println("No money to refund.");
    }
}
