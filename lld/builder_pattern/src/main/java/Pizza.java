public class Pizza {
    private String size;
    private String crust;
    private boolean cheese;
    private boolean pepperoni;

    public void setSize(String size) { this.size = size; }
    public void setCrust(String crust) { this.crust = crust; }
    public void setCheese(boolean cheese) { this.cheese = cheese; }
    public void setPepperoni(boolean pepperoni) { this.pepperoni = pepperoni; }

    public void showPizza() {
        System.out.println("Pizza with " + size + " size, " + crust + " crust, cheese: " + cheese + ", pepperoni: " + pepperoni);
    }
}
