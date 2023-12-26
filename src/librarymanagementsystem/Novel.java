package librarymanagementsystem;

public class Novel extends Book {
    private String type;

    public Novel(String title, String author, int yearOfPublication, String type) {
        super(title, author, yearOfPublication);
        this.type = type;
    }

    public void displayInformation() {
        System.out.printf("Novel(%s, %s, %d, %s)", getTitle(), getAuthor(), getYearOfPublication(), type);
    }
}
