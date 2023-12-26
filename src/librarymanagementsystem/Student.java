package librarymanagementsystem;

public class Student extends Person implements LibraryUser {
    private LibraryCard libraryCard;

    public Student(String name, int age, LibraryCard libraryCard) {
        super(name, age);
        this.libraryCard = libraryCard;
    }

    public Student(String name, int age) {
        super(name, age);
        this.libraryCard = null;
    }


    @Override
    public void borrowBook(String title, String author) {
        if (libraryCard == null) {
            System.out.println("Student doesn't have library card.");
            return;
        }
        if (libraryCard.getStatus() != LibraryCardStatus.ACTIVE) {
            System.out.println("Student library card is not active!");
            return;
        }
        if (getBorrowedBooksCount() >= 5) {
            System.out.println("Students can't borrow more than 5 books!");
            return;
        }
        Book book = libraryCard.getLibrary().findBook(title, author);
        if (book == null) {
            System.out.println("Book is not available in the library!");
            return;
        }
        addBook(book);
        System.out.printf("Student %s has borrowed book %s.\n", getName(), book.getTitle());
    }

    @Override
    public void returnBook(String title, String author) {
        if (libraryCard == null) {
            System.out.println("Student doesn't have library card.");
            return;
        }
        Book book = libraryCard.getLibrary().findBook(title, author);
        if (book == null) {
            System.out.println("Book is not registered in the library!");
            return;
        }
        if (removeBook(book)) {
            System.out.printf("Student %s has returned book %s.\n", getName(), book.getTitle());
        } else {
            System.out.println("Book is not borrowed!");
        }
    }

    @Override
    public void setLibraryCard(LibraryCard libraryCard) {
        this.libraryCard = libraryCard;
    }
}
