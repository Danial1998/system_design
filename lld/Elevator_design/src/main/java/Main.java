public class Main {
    public static void main(String[] args) {
        Elevator elevator = new Elevator();
        ElevatorController controller = new ElevatorController(elevator);

        controller.requestFloor(3);
        controller.requestFloor(5);
        controller.requestFloor(1);
    }
}
