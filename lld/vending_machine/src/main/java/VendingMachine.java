public class VendingMachine {
    private State state;
    private Inventory inventory;
    private int balance;
    private String selectedProduct;

    public VendingMachine() {
        this.state = new IdleState();
        this.inventory = new Inventory();
        this.balance = 0;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void insertMoney(int amount) {
        state.insertMoney(this, amount);
    }

    public void selectProduct(String product) {
        selectedProduct = product;
        state.selectProduct(this, product);
    }

    public void dispenseProduct() {
        state.dispenseProduct(this);
    }

    public void refundMoney() {
        state.refundMoney(this);
    }

    public void addBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public boolean isProductAvailable(String product) {
        return inventory.isAvailable(product);
    }

    public int getProductPrice(String product) {
        return inventory.getProduct(product).getPrice();
    }

    public void reduceInventory(String product) {
        inventory.reduceProduct(product);
    }

    public void returnChange() {
        System.out.println("Returning change: " + balance);
        balance = 0;
    }

    public void addProduct(Product product, int quantity) {
        inventory.addProduct(product, quantity);
    }

    public String getSelectedProduct() {
        return selectedProduct;
    }
}
