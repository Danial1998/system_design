public class Main {
    public static void main(String[] args) {
        TransportFactory factory = new TransportFactory();

        Transport truck = factory.createTransport("Truck");
        truck.deliver();

        Transport ship = factory.createTransport("Ship");
        ship.deliver();

        //Without using the Factory Design Pattern, the client code would directly
        // instantiate the Truck and Ship objects. This makes the code less flexible
        // and more tightly coupled to the specific classes

        //        Transport truck = new Truck();
        //        truck.deliver();  // Output: Deliver by land.
        //
        //        Transport ship = new Ship();
        //        ship.deliver();  // Output: Deliver by sea.
    }
}
