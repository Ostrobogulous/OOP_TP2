package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        books.add(book);
        System.out.printf("Book %s is added to the library\n", book.getTitle());
    }

    public void removeBook(Book book) {
        if (books.contains(book)) {
            books.remove(book);
            System.out.printf("Book %s is removed from the library\n", book.getTitle());
        } else {
            System.out.printf("Book %s is not in the library\n", book.getTitle());
        }
    }

    public void removeBook(String title, String author) {
        for (int i = 0; i < this.books.size(); i++) {
            if (Objects.equals(books.get(i).getTitle(), title) && Objects.equals(books.get(i).getAuthor(), author)) {
                books.remove(i);
                return;
            }
        }
    }

    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("There are no books available now in the library.");
        } else {
            System.out.printf("Books available in %s library: \n", this.name);
            for (Book book : books) {
                book.displayInformation();
            }
        }
    }

    public Book findBook(String title, String author) {
        for (int i = 0; i < this.books.size(); i++) {
            if (Objects.equals(books.get(i).getTitle(), title) && Objects.equals(books.get(i).getAuthor(), author)) {
                return books.get(i);
            }
        }
        return null;
    }
}



