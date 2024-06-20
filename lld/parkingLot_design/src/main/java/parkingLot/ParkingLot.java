package parkingLot;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private String parkingLotId;
    private List<Floor> floors;

    public ParkingLot(String parkingLotId, int numFloors, int slotsPerFloor){
        this.parkingLotId = parkingLotId;
        this.floors = new ArrayList<>();
        for(int i=1;i<=numFloors;i++){
            floors.add(new Floor(i,slotsPerFloor));
        }
    }

    public Ticket parkVehicle(Vehicle vehicle){
        for(Floor floor:floors){
            Ticket ticket = floor.parkVehicle(vehicle, parkingLotId);
            if(ticket!=null) return ticket;
        }
        return null;
    }

    public Vehicle unparkVehicle(String ticketId){
        String[] parts = ticketId.split("_");
        int floorNumber = Integer.parseInt(parts[1]);
        int slotNumber = Integer.parseInt(parts[2]);

        return floors.get(floorNumber-1).unparkVehicle(slotNumber);
    }


}
