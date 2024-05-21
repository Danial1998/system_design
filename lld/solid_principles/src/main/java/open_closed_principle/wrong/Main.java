package open_closed_principle.wrong;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        double rectangleArea = calculator.calculateRectangleArea(5, 10);
        double circleArea = calculator.calculateCircleArea(7);
        System.out.println("Rectangle Area: " + rectangleArea);
        System.out.println("Circle Area: " + circleArea);
    }
}

//This approach is not scalable because every
// time we add a new shape, we have to modify the
// AreaCalculator class, which violates the Open/Closed Principle.
