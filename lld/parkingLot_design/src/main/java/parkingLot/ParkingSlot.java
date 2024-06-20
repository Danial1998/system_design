package parkingLot;

public class ParkingSlot {
    private int slotNumber;
    private String slotType;
    private Vehicle parkedVehicle;

    public ParkingSlot(int slotNumber, String slotType){
        this.slotNumber = slotNumber;
        this.slotType = slotType;
    }

    public  boolean isFree(){
        return parkedVehicle == null;
    }

    public boolean canPark(Vehicle vehicle){
        return slotType.equals(vehicle.getType());
    }

    public boolean canPark(String vehicleType){
        return slotType.equals(vehicleType);
    }

    public void park(Vehicle vehicle){
        this.parkedVehicle = vehicle;
    }

    public Vehicle unpark(){
        Vehicle vehicle = this.parkedVehicle;
        this.parkedVehicle = null;
        return  vehicle;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public String getSlotType() {
        return slotType;
    }
}
