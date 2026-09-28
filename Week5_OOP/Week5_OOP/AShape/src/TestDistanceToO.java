import junit.framework.TestCase;

public class TestDistanceToO extends TestCase {
    public void testDistanceToO(){
        CartesianPoint p = new CartesianPoint(3, 4);
        Rectangle r = new Rectangle(p, 5, 17);
        assertEquals(5.0,r.distanceToO(),0.1);
        //square, dot, circle
        CartesianPoint l1 = new CartesianPoint(3,4);
        Dot d1 = new Dot(l1);
        assertEquals(d1.distanceToO(), 5, 0.1);
        Circle c1 = new Circle(l1, 40);
        assertEquals(c1.distanceToO(), 5, 0.1);
        Square s1 = new Square(l1, 5);
        assertEquals(s1.distanceToO(), 5,0.1);
    }

}
