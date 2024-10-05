import java.util.ArrayList;
import java.util.List;

public class Library {
    // issue "Enhance performance of library class" done in this code
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
    public void removeBook(String bookName) {
        if (books.remove(bookName)) {
            System.out.println(bookName + " removed from the library.");
        } else {
            System.out.println(bookName + " not found in the library.");
        }
    }

}
