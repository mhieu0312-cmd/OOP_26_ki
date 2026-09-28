import junit.framework.TestCase;

public class TestConstructor extends TestCase {

    public void testConstructor(){
        Manufacturer m1 = new Manufacturer("Samsung", "Korea");

        Refrigerator r1 = new Refrigerator("Samsung", 1000.0, 2, m1, true);

        WashingMachine w1 = new WashingMachine("LG", 2000.0, 3, new Manufacturer("LG", "Korea"), true);

        ListHomeAppliances list = new Cons(r1, new Cons(w1, new Empty()));
    }
}
