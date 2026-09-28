public class Refrigerator extends HomeAppliances{
    private boolean singleDoor;

    public Refrigerator(String brand, double sellingPrice, int warrantyPeriodTime, Manufacturer manufacturer, boolean singleDoor){
        super(brand, sellingPrice, warrantyPeriodTime, manufacturer);
        this.singleDoor = singleDoor;
    }
}
