import junit.framework.TestCase;

public class TestShape extends TestCase {
    public void testConstructor(){
        //square
        new Square(new CartesianPoint(30, 60), 30);

        CartesianPoint location = new CartesianPoint(30, 60);
        new Square(location, 30);
        //circle
        new Circle(new CartesianPoint(0, 0), 30);
        //Dot
        new Dot(new CartesianPoint(100, 200));
        CartesianPoint location1 = new CartesianPoint(100, 200);
        new Dot(location1);
    }

    public void testMethod(){
        CartesianPoint loc1 = new CartesianPoint(20, 30);
        Dot d1 = new Dot(loc1);
        assertEquals(d1.area(),0,0.01);
        //circle
        Circle c1 = new Circle(loc1, 5);
        assertEquals(c1.area(),78.5398,0.1);
        //square
        Square s1 = new Square(loc1, 4);
        assertEquals(s1.area(),16,0.01);
    }
}
