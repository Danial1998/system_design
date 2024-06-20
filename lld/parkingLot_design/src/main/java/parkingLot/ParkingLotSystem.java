package parkingLot;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ParkingLotSystem {

    private static final String PARKING_LOT_ID = "PLOT123";
    private Map<String, ParkingLot> parkingLots = new HashMap<>();

    public static void main(String[] args) {
        ParkingLotSystem system = new ParkingLotSystem();
        Scanner scanner = new Scanner(System.in);

        while(true){
            String command = scanner.nextLine();
            if(command.equals("exit")) break;
            system.executeCommand(command);
        }
    }

    private void executeCommand(String command){
        String[] parts = command.split(" ");
        String action = parts[0];

        switch (action){
            case "create_parking_lot":
                createParkingLot(PARKING_LOT_ID,Integer.parseInt(parts[2]),Integer.parseInt(parts[3]));
                break;
            case "park_vehicle":
                parkVehicle(parts[1],parts[2],parts[3]);
                break;
            case "unpark_vehicle":
                unparkVehicle(parts[1]);
                break;
        }
    }

    private void createParkingLot(String parkingLotId, int floors, int slotsPerFloor){
        parkingLots.put(parkingLotId, new ParkingLot(parkingLotId, floors, slotsPerFloor));
        System.out.printf("Parking lot created with %d floors and %d slots per floor\n",floors,slotsPerFloor);
    }

    private void parkVehicle(String vehicleType, String regNo, String color){
                Vehicle vehicle = new Vehicle(vehicleType,regNo,color);
                Ticket ticket = parkingLots.get(PARKING_LOT_ID).parkVehicle(vehicle);
                if(ticket!=null)
                    System.out.printf("Parked vehicle. Ticket ID: %s\n",ticket.getTicketId());
                else
                    System.out.printf("Parking lot full");

    }

    public void unparkVehicle(String ticketId){
        Vehicle vehicle = parkingLots.get(PARKING_LOT_ID).unparkVehicle(ticketId);
        if(vehicle!=null)
            System.out.printf("Unpared vehicle qith registration number %s and color %s\n",vehicle.getRegNo(),vehicle.getColor());
        else
            System.out.println("Invalid Ticket");
    }


}
