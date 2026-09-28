public class Cons extends ListVehicles{
    private Vehicles first;
    private ListVehicles rest;

    public Cons(Vehicles first, ListVehicles rest){
        this.first = first;
        this.rest = rest;
    }
}
