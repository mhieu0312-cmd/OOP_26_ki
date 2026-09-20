public class CD extends Item{
    private Artist artist;
    private int numberOfTrack;

    public CD(int numberOfItem, String title, Artist artist, int numberOfTrack) {
        super(numberOfItem, title);
        this.artist = artist;
        this.numberOfTrack = numberOfTrack;
    }
}