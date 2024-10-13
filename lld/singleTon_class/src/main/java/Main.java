public class Main {
    public static void main(String[] args) {
        WaterJug glass1 = WaterJug.getInstance();
        System.out.println("Here is your water in litres: " + glass1.getWater(500));
    }
}
