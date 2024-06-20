package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class Floor {
    private int floorNumber;
    private List<ParkingSlot> slots;

    public Floor(int floorNumber, int numSlots){
        this.floorNumber = floorNumber;
        this.slots = new ArrayList<>();
        for(int i=1;i<=numSlots;i++){
            if(i==1){
                slots.add(new ParkingSlot(i,"Truck"));
            } else if(i==2 || i==3){
                slots.add(new ParkingSlot(i,"Bike"));
            } else {
                slots.add(new ParkingSlot(i,"Car"));
            }
        }
    }

    public Ticket parkVehicle(Vehicle vehicle, String parkingLotId){
        for(ParkingSlot slot:slots){
            if(slot.isFree() && slot.canPark(vehicle)){
                slot.park(vehicle);
                return new Ticket(parkingLotId, floorNumber, slot.getSlotNumber());
            }
        }
        return null;
    }

    public Vehicle unparkVehicle(int slotNumber){
        ParkingSlot slot  = slots.get(slotNumber-1);
        return slot.unpark();
    }
}
