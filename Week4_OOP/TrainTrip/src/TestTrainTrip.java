import junit.framework.TestCase;

public class TestTrainTrip extends TestCase {
    public void testConstructor() {
        Time d1 = new Time(23, 50);
        Time a1 = new Time(13, 20);

        Station origin1 = new Station("New York");
        Station destination1 = new Station("Boston");
        AList stops1 = new Cons(
                new Stops("HCM"),
                new Cons(
                        new Stops("Vung Tau"),
                        new Empty()
                )
        );
        Schedule s1 = new Schedule(
                d1, a1, origin1, destination1, stops1
        );
        TrainTrip t1 = new TrainTrip(s1, true);


        Time d2 = new Time(10, 34);
        Time a2 = new Time(13, 18);
        Station origin2 = new Station("Chicago");
        Station destination2 = new Station("New York");
        AList stops2 = new Cons(
                new Stops("HCM"),
                new Cons(
                        new Stops("Vung Tau"),
                        new Empty()
                )
        );
        Schedule s2 = new Schedule(
                d2, a2, origin2, destination2, stops2
        );
        TrainTrip t2 = new TrainTrip(s2, false);
    }
}