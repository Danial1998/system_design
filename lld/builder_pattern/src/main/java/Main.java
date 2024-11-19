public class Main {
    public static void main(String[] args) {
        Pizza pizza = new PizzaBuilder()
                .setSize("Large")
                .setCrust("Thin")
                .addCheese()
                .addPepperoni().build();

        pizza.showPizza();
    }
}
