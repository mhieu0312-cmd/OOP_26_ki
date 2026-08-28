import junit.framework.TestCase;

public class TestImage extends TestCase{
    public void testConstructor(){
        new Image(5,10,"small.gif","low");
        new Image(120,200,"med.gif","low");
        new Image(1200,1000,"large.gif","high");
    }

    public void testisPortrait(){
        assertFalse(new Image(5,10,"small.gif","low").isPortrait());
        assertFalse(new Image(120,200,"med.gif","low").isPortrait());
        assertTrue(new Image(1200,1000,"large.gif","high").isPortrait());
    }

    public void testSize(){
        assertEquals(new Image(5,10,"small.gif","low").Size(),50);
        assertEquals(new Image(120,200,"med.gif","low").Size(), 24000);
        assertEquals(new Image(1200,1000,"large.gif","high").Size(), 1200000);
    }
    public void testisLarger(){
        Image img1 = new Image(5,10,"small.gif","low");
        Image img2 = new Image(120,200,"med.gif","low");
        Image img3 = new Image(1200,1000,"large.gif","high");

        assertFalse(img1.isLarger(img2));
        assertTrue(img3.isLarger(img2));
    }
}
