public class Rectangle extends AShape{
    private int width;
    private int height;
    private CartesianPoint northWestCorner;

    public Rectangle(CartesianPoint northWestCorner, int width, int height) {
        this.northWestCorner = northWestCorner;
        this.width = width;
        this.height = height;
    }
    public double distanceToO(){
        return this.northWestCorner.distanceToO();
    }

    public CartesianPoint caculateCenter(){
        double a = this.northWestCorner.getX() + this.width/2;
        double b = this.northWestCorner.getY() + this.height/2;

        return new CartesianPoint((int)(a),(int)(b));
    }
    public double distanceFromCenterToO(){
            return this.caculateCenter().distanceToO();
    }
}
