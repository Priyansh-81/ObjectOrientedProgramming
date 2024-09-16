import java.util.*;

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[6];
        books[0] = new Book("Java programming", "Herbert Schildt", 1);
        books[1] = new Book("Java: The complete Reference", "Herbert Schildt", 2);
        books[2] = new Book("Lord of the Rings", "J.R.R. Tolkien", 4);
        books[3] = new Book("Harry Potter", "J. K. Rowling", 3);
        books[4] = new Book("Clean Code", "Robert C. Martin", 6);
        books[5] = new Book("Thinking in Java", "Bruce Eckel", 5);

        Book.ascending(books);

        // Display the books by a specific author
        Scanner mj = new Scanner(System.in);
        System.out.println("Enter author:");
        String auth = mj.nextLine(); // Use nextLine() to read the full line
        mj.close();

        boolean found = false;
        for (Book book : books) {
            if (auth.equals(book.author)) { 
                book.display();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No books found by the author: " + auth);
        }
    }
}

class Book {
    String title;
    String author;
    int edition;

    Book(String title, String author, int edition) {
        this.title = title;
        this.author = author;
        this.edition = edition;
    }

    static void ascending(Book[] books) {
        for (int i = 0; i < books.length - 1; i++) {
            for (int j = 0; j < books.length - i - 1; j++) {
                if (books[j].title.compareTo(books[j + 1].title) > 0) {
                    // Swap books[j] and books[j+1]
                    Book temp = books[j];
                    books[j] = books[j + 1];
                    books[j + 1] = temp;
                }
            }
        }
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Edition: " + edition);
        System.out.println(); // Add a newline for better readability
    }
}