import junit.framework.TestCase;

public class TestConstructor extends TestCase {

    public void testConstructor() {
        Date d1 = new Date(12, 03, 2007);
        Artist a1 = new Artist("idk", d1);
        
        Book b1 = new Book(1, "ConCoBeBe", "Hoang", 2026);
        CD c1 = new CD(2, "NoDauCanhTre", a1, 36);
        DVD dvd1 = new DVD(3, "DiKhongHoiMe", "Honor", 60);
        DVD dvd2 = new DVD(4, "BietDiDuongNao", "Peach", 180);
    }
}
