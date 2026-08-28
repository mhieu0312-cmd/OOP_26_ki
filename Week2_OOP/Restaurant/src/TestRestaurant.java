import junit.framework.TestCase;

public class TestRestaurant extends TestCase {
    public void testConstructor(){
        Intersection i1 = new Intersection(7, 65);
        Restaurant r1 = new Restaurant("La Crepe","French food","moderate", i1);

        Intersection i2 = new Intersection(2, 86);
        Restaurant r2 = new Restaurant("Bremen haus","German food","moderate", i2);
    }
}