public class House {
    private String kind;
    private int numberOfRooms;
    private Address address;
    private Double price;

    public House(String kind, int numberOfRooms, Address address, Double price){
        this.kind = kind;
        this.numberOfRooms = numberOfRooms;
        this.address = address;
        this.price = price;
    }
}
