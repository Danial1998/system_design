public class TransportFactory {
    public Transport createTransport(String type){
        if (type.equals("Truck")) {
            return new Truck();
        } else if (type.equals("Ship")) {
            return new Ship();
        }
        return null;
    }
}
