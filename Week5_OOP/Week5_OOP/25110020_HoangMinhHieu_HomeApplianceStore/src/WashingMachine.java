public class WashingMachine extends HomeAppliances{
    private boolean topLoading;

    public WashingMachine(String brand, double sellingPrice, int warrantyPeriodTime, Manufacturer manufacturer, boolean topLoading){
        super(brand, sellingPrice, warrantyPeriodTime, manufacturer);
        this.topLoading = topLoading;
    }
}
