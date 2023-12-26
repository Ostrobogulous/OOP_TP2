package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<Book> borrowedBooks;

    Person(String name, int age) {
        this.name = name;
        assert age > 0 : "Age must be positive";
        this.age = age;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age <= 0) {
            System.out.println("Age must be positive.");
            return;
        }
        this.age = age;
    }

    public int getBorrowedBooksCount() {
        return borrowedBooks.size();
    }

    public void showBorrowedBooks() {
        System.out.printf("Books borrowed by %s:\n", name);
        for (Book book : borrowedBooks) {
            book.displayInformation();
            System.out.println();
        }
    }

    public void addBook(Book book) {
        borrowedBooks.add(book);
    }

    public boolean removeBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            return true;
        } else {
            return false;
        }
    }
}
