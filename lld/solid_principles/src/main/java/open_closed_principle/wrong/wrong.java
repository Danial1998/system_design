package open_closed_principle.wrong;

public class wrong {
}

class AreaCalculator {
    public double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}

