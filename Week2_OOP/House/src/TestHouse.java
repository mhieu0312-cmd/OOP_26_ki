import junit.framework.TestCase;

public class TestHouse extends TestCase {
    public void testConstructor() {
        Address a1 = new Address(23, "Maple Street", "Brookline");
        House h1 = new House("Ranch", 7, a1, 375,000);

        Address a2 = new Address(5, "Joye Road", "Newton");
        House h2 = new House("Colonial", 9, a2, 450,000);

        Address a3 = new Address(83, "Winslow Road", "Waltham");
        House h3 = new House("Cape", 6, a3, 235,000);
    }
}
