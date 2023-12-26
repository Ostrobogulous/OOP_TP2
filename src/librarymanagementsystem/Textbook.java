package librarymanagementsystem;

public class Textbook extends Book {
    private String topic;

    public Textbook(String title, String author, int yearOfPublication, String topic) {
        super(title, author, yearOfPublication);
        this.topic = topic;
    }

    public void displayInformation() {
        System.out.printf("Textbook(%s, %s, %d, %s)", getTitle(), getAuthor(), getYearOfPublication(), this.topic);
    }
}
