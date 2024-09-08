public class Elevator {
    private int currentFloor;
    private boolean isMovingUp; //for direction
    private boolean isMoving;

    Elevator(){
        this.currentFloor = 0;
        this.isMovingUp = true;
        this.isMoving = false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public boolean isMovingUp() {
        return isMovingUp;
    }

    public void moveUp(){
        currentFloor++;
        System.out.println("Elevator moving up to floor "+currentFloor);
    }

    public void moveDown(){
        currentFloor--;
        System.out.println("Elevator moving down to floor "+currentFloor);
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setDirection(boolean direction){
        this.isMovingUp = direction;
    }

    public void startMoving(){
        this.isMoving = true;
    }

    public void stop(){
        this.isMoving = false;
        System.out.println("Elevator stopped at floor "+currentFloor);
    }

}
