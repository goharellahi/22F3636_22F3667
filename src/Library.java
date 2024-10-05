import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<String> books = new ArrayList<>();

    public void addBook(String bookName) {
        books.add(bookName);
        System.out.println(bookName + " added to the library.");
    }

    public void listBooks() {
        System.out.println("Books in the library: " + books);
    }

    public static void main(String[] args) {
        Library library = new Library();
        library.addBook("The Great Gatsby");
        library.addBook("To Kill a Mockingbird");
        library.listBooks();
    }
    public boolean searchBook(String bookName) {
        return books.contains(bookName);
    }
}
