package afterClass;
import java.util.ArrayList;

public class Library {
    private ArrayList<Book> library;

    public Library() {
        library = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        library.add(book);
    }

    public void addBook(Ebook ebook) {
        library.add(ebook);
    }

    public void addBook(Audiobook audiobook) {
        library.add(audiobook);
    }

    public void removeBook(String title) {
        for (Book book: library) {
            if (title == book.getTitle()) {
                library.remove(book);
                System.out.println("Usunięto książkę " + title + "!");
                break;
            } else if (title != book.getTitle() && library.indexOf(book) == library.size() - 1) {
                System.out.println("Nie znaleziono takiej książki.");
            }
        }
    }

    public void displayBooks() {
        for (Book book: library) {
            book.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Book b1 = new Book("W pustyni", "Jacek Kowalski");
        Ebook b2 = new Ebook("Mariolka", "Miłosz Węgrzyn", "Mariolka.pdf");
        Audiobook b3 = new Audiobook("Autostrady w Europie", "Samozwaniec", 40, 10);
        Library l1 = new Library();

        l1.addBook(b1);
        l1.addBook(b2);
        l1.addBook(b3);
        l1.removeBook("Mariolka");
        l1.displayBooks();
    }
}
