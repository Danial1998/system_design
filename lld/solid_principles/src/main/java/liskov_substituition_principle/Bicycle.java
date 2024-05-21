package liskov_substituition_principle;

class Bicycle extends Vehicle {
    @Override
    public void startEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }

    @Override
    public void stopEngine() {
        throw new UnsupportedOperationException("Bicycles don't have engines");
    }

    @Override
    public void move() {
        System.out.println("Bicycle is moving");
    }
}

//This setup actually violates the Liskov Substitution Principle
// because the Bicycle class cannot be used as a substitute for the
// Vehicle class due to the lack of engine-related functionality.
//
//To adhere to LSP, we should rethink our design.
// One way to fix this is to separate the Vehicle functionality
// into two interfaces: EngineVehicle for vehicles with engines,
// and Vehicle for general movement:
