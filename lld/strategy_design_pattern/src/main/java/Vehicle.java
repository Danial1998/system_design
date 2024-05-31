public class Vehicle {
    private DriveStrategy driveStrategy; //this is the strategy pattern
    //Instead of implementing the drive method in parent class.
    // We create a separate interface
    //and inject it in the vehicle class through constructor injection

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }
}
