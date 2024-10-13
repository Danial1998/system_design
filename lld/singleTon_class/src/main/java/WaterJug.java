public class WaterJug {
    private WaterJug(){}
    private static WaterJug object = null;
    private int waterQuantity = 500;

    //method to provide the service of giving water
    public int getWater(int quantity){
        waterQuantity = waterQuantity-quantity;
        return quantity;
    }

    //method to get instance of the Water Jug class
    public static WaterJug getInstance(){
        if(object == null){
            object = new WaterJug();

        }
        return object;
    }
}
