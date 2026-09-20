public class DVD extends Item{
    private String kind;
    private int length;

    public DVD(int numberOfItem, String title, String kind, int length){
        super(numberOfItem, title);
        this.kind = kind;
        this.length = length;
    }
}
