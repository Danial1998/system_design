package liskov_substituition_principle;

class Motorcycle extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Motorcycle engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Motorcycle engine stopped");
    }

    @Override
    public void move() {
        System.out.println("Motorcycle is moving");
    }
}
