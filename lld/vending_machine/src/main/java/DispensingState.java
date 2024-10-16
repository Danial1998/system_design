public class DispensingState implements State {

    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        System.out.println("Please wait. Dispensing product.");
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        System.out.println("Already dispensing a product.");
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Dispensing product...");
        machine.reduceInventory(machine.getSelectedProduct());
        machine.returnChange();
        machine.setState(new IdleState());
    }

    @Override
    public void refundMoney(VendingMachine machine) {
        System.out.println("Cannot refund. Dispensing product.");
    }
}
