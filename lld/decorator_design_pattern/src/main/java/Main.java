public class Main {
    public static void main(String[] args) {
        BasePizza pizza1 = new NonVegPIzza();
        ToppingDecorator pizza1WithExtraChicken = new ExtraChicken(pizza1);

        System.out.println(pizza1.cost());
        System.out.println(pizza1WithExtraChicken.cost());
    }
}
