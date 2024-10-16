public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();

        machine.addProduct(new Product("Coke", 25), 10);
        machine.addProduct(new Product("Pepsi", 35), 5);

        // Interact with the vending machine
        machine.insertMoney(50);
        machine.selectProduct("Coke");
        machine.dispenseProduct();

        // Refund scenario
        machine.insertMoney(10);
        machine.refundMoney();
    }
}
