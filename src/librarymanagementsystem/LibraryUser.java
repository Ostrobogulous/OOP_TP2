package librarymanagementsystem;

public interface LibraryUser {
    void borrowBook(String title, String author);

    void returnBook(String title, String author);

    void setLibraryCard(LibraryCard libraryCard);
}


