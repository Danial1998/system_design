package parkingLot;

public class Ticket {
    private String ticketId;

    public Ticket(String parkingLotId, int floorNo, int slotNo){
        this.ticketId = String.format("%s_%d_%d", parkingLotId, floorNo, slotNo);
    }

    public String getTicketId() {
        return ticketId;
    }
}
