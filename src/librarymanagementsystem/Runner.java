package librarymanagementsystem;

public class Runner {
    public static void main(String[] args) {
        Library library = new Library("THE FLASH");
        Novel novel = new Novel("The Great Novel", "The Great Author", 2022, "History");
        Textbook textbook = new Textbook("Clean Code", "Robert C. Martin", 2008, "Computer Science");
        Book book = new Book("The Book", "Samir Hamza", 2024);
        library.addBook(novel);
        library.addBook(textbook);
        library.addBook(book);

        Student student = new Student("Iyed Abdelli", 20);
        LibraryCard libraryCard = new LibraryCard(library);
        student.borrowBook("Clean Code", "Robert C. Martin");
        student.setLibraryCard(libraryCard);
        student.borrowBook("Clean Code", "Robert C. Martin");
        student.showBorrowedBooks();
        student.returnBook("Clean Code", "Robert C. Martin");

        Teacher teacher = new Teacher("Some Teacher", 25);
        teacher.borrowBook("The Book", "Samir Hamza");
        teacher.setLibraryCard(libraryCard);
        teacher.borrowBook("The Book", "Samir Hamza");
        teacher.showBorrowedBooks();
        teacher.returnBook("The Book", "Samir Hamza");


    }
}
