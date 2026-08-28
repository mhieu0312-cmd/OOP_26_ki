import junit.framework.TestCase;

public class TestTrainTrip extends TestCase {
    public void tesConstructor() {
        Route r = new Route("New York", "Boston");
        ClockTIme d = new ClockTIme(23, 50);
        ClockTIme a = new ClockTIme(13, 20);
        Schedule s = new Schedule(d, a);
        TrainTrip t1 = new TrainTrip(r, s, true);

        r = new Route("Chicago", "New York");
        d = new ClockTIme(10, 34);
        a = new ClockTIme(13, 18);
        s = new Schedule(d, a);
        TrainTrip t2 = new TrainTrip(r, s, false);
    }
}
