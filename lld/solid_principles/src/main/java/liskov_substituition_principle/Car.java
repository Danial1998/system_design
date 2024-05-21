package liskov_substituition_principle;

class Car extends Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Car engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped");
    }

    @Override
    public void move() {
        System.out.println("Car is moving");
    }
}

