import junit.framework.TestCase;

public class TestAnimal extends TestCase {
    public void testConstructor(){
        Animal a1 = new Lion("Leo", 300, 5);
        Animal a2 = new Snake("Boa", 50, 5);
        Animal a3 = new Monkey("George", 150, "banana");
        Animal a4 = new Monkey("Mina", 120, "wiki");
    }
}
