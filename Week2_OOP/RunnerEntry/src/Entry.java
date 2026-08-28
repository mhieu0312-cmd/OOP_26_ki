public class Entry {
    private Date date;
    private double distance;
    private int duration;
    private String postRunFeeling;

    public Entry(Date date, double distance, int duration, String postRunFeeling){
        this.date = date;
        this.distance = distance;
        this.duration = duration;
        this.postRunFeeling = postRunFeeling;
    }
}