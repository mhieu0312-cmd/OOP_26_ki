public class Confluence extends ARiver{
    protected ARiver left;
    protected ARiver right;

    public Confluence(Location location, ARiver left, ARiver right){
        super(location);
        this.left=left;
        this.right= right;
    }
}
