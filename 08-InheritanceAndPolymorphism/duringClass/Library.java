package duringClass;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> arr = new ArrayList<Book>();

    public Book getBook(int index) {
        return arr.get(index);
    }

    public void addBook(String title, String author) {
        arr.add(new Book(title, author));
    }

    public void addBook(String title, String author, String file) {
        arr.add(new Ebook(title, author, file));
    }

    public void addBook(String title, String author, int minutes, int seconds) {
        arr.add(new Audiobook(title, author, minutes, seconds));
    }

    public void displayBooks() {
        for (Book b: arr) {
            b.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook("Opowieści z Narnii", "C.S.Lewis");
        lib.addBook("W pustyni i w puszczy", "Henryk Sienkiewicz", "wPustyni.pdf");
        lib.addBook("W pustyni i w puszczy", "Henryk Sienkiewicz", 130, 50);

        lib.displayBooks();
    }
}
