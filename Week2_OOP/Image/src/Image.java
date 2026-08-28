public class Image {
    private int height;
    private int width;
    private String fileName;
    private String quality;

    public Image(int height, int width, String fileName, String quality){
        this.height = height;
        this.width = width;
        this.fileName = fileName;
        this.quality = quality;

    }
    //anh thang?
    public boolean isPortrait() {
        return this.width < this.height;
    }
    //size anh?
    public int Size(){
        return this.height * this.width;
    }
    //anh nao rong hon
    public boolean isLarger (Image that){
        return this.Size() > that.Size();
    }

}


