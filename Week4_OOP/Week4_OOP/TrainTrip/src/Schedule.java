public class Schedule {
    private Time departure;
    private Time arrival;
    private Station origin;
    private Station destination;
    private AList stops;

    public Schedule(Time departure, Time arrival, Station origin, Station destination, AList stops) {
        this.departure = departure;
        this.arrival = arrival;
        this.origin = origin;
        this.destination = destination;
        this.stops = stops;
    }
}