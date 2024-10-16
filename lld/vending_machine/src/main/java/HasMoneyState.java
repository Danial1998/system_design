public class HasMoneyState implements State {
    @Override
    public void insertMoney(VendingMachine machine, int amount) {
        machine.addBalance(amount);
        System.out.println("Money inserted: " + amount);
    }

    @Override
    public void selectProduct(VendingMachine machine, String product) {
        if (machine.isProductAvailable(product)) {
            if (machine.getBalance() >= machine.getProductPrice(product)) {
                machine.setState(new DispensingState());
                machine.dispenseProduct();
            } else {
                System.out.println("Insufficient funds. Please insert more money.");
            }
        } else {
            System.out.println("Product out of stock.");
            machine.setState(new IdleState());
        }
    }

    @Override
    public void dispenseProduct(VendingMachine machine) {
        System.out.println("Select a product first.");
    }

    @Override
    public void refundMoney(VendingMachine machine) {
        System.out.println("Refunding money: " + machine.getBalance());
        machine.setBalance(0);
        machine.setState(new IdleState());
    }
}
