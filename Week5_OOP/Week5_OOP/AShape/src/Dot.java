public class Dot extends AShape {

    public Dot(CartesianPoint location){
        super(location);
    }

    public double area() {
        return 0;
    }

    public boolean constains(CartesianPoint point) {
        return this.location.equals(point);
    }
}
