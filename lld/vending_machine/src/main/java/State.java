public interface State {
    void insertMoney(VendingMachine machine, int amount);
    void selectProduct(VendingMachine machine, String product);
    void dispenseProduct(VendingMachine machine);
    void refundMoney(VendingMachine machine);
}
