import java.util.PriorityQueue;

public class ElevatorController {
    private Elevator elevator;
    private PriorityQueue<Integer> upRequests;
    private PriorityQueue<Integer> downRequests;

    ElevatorController(Elevator elevator){
        this.elevator = elevator;
        this.upRequests = new PriorityQueue<>(); //min heap for up-requests
        this.downRequests = new PriorityQueue<>((a,b)-> b-a); //max heap for down-requests
    }

    public void requestFloor(int floor){
        if(elevator.getCurrentFloor()<floor){
            upRequests.add(floor);
        } else {
            downRequests.add(floor);
        }

        if(!elevator.isMoving()){
            processNextRequest();
        }
    }

    private void processNextRequest() {
        while(!upRequests.isEmpty() || !downRequests.isEmpty()){
            elevator.startMoving();

            if(elevator.isMovingUp() && !upRequests.isEmpty()){
                int nextFloor = upRequests.poll();
                while(elevator.getCurrentFloor()<nextFloor) elevator.moveUp();
                elevator.stop();
            } else if(!elevator.isMovingUp() && !downRequests.isEmpty()){
                int nextFloor = downRequests.poll();
                while(elevator.getCurrentFloor()>nextFloor) elevator.moveDown();
                elevator.stop();
            }

            //switchDirections
            if(elevator.isMovingUp() && upRequests.isEmpty()) elevator.setDirection(false);
            else if(!elevator.isMovingUp() && downRequests.isEmpty()) elevator.setDirection(true);
        }

//        elevator.stop();
    }
}
