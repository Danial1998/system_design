public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder(){
        pizza = new Pizza();
    }

    public PizzaBuilder setSize(String size) {
        pizza.setSize(size);
        return this;
    }

    public PizzaBuilder setCrust(String crust) {
        pizza.setCrust(crust);
        return this;
    }

    public PizzaBuilder addCheese() {
        pizza.setCheese(true);
        return this;
    }

    public PizzaBuilder addPepperoni() {
        pizza.setPepperoni(true);
        return this;
    }

    public Pizza build() {
        return pizza;
    }

}
