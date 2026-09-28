public abstract class AShape {
    protected CartesianPoint location;

    protected AShape (CartesianPoint location){
        this.location = location;
    }
    public abstract double area();

    public double distanceToO(){
        return this.location.distanceToO();
    }

    public abstract boolean constains(CartesianPoint point);
}
