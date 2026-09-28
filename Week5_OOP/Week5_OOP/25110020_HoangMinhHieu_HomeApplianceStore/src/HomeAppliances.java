public abstract class HomeAppliances {
    protected String brand;
    protected double sellingPrice;
    protected int warrantyPeriodTime;
    protected Manufacturer manufacturer;

    public HomeAppliances(String brand, double sellingPrice, int warrantyPeriodTime, Manufacturer manufacturer) {
        this.brand = brand;
        this.sellingPrice = sellingPrice;
        this.warrantyPeriodTime = warrantyPeriodTime;
        this.manufacturer = manufacturer;
    }
}
