import junit.framework.TestCase;

public class TestEntry extends TestCase {
    public void testConstructor(){
        Date d1 = new Date(5,6,2003);
        Entry e1 = new Entry(d1, 5.3, 27, "Good");

        Date d2 = new Date(6,6,2003);
        Entry e2 = new Entry(d2, 2.8, 24, "Tired");

        Date d3 = new Date(23,6,2003);
        Entry e3 = new Entry(d3, 26.2, 150, "Exhausted");
    }
}
