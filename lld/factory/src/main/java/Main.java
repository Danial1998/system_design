public class Main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.Draw();

        Shape square = shapeFactory.getShape("SQUARE");
        square.Draw();

    }
}
