public class Book extends Item{
    private String nameAuthor;
    private int publicationYear;

    public Book(int numberOfItem, String title, String nameAuthor, int publicationYear){
        super(numberOfItem, title);
        this.nameAuthor = nameAuthor;
        this.publicationYear = publicationYear;
    }
}
