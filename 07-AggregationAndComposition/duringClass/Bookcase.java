package duringClass;
import java.util.ArrayList;

public class Bookcase {
    private String name, location;
    private int noOfBooks;
    private ArrayList<Book> books = new ArrayList<Book>();

    public Bookcase(String name, String location) {
        this.name = name;
        this.location = location;
        this.noOfBooks = 0;
    }

    public void add(Book book) {
        books.add(book);
        this.noOfBooks++;
    }

    public void remove(String title) {
        for (Book book: books) {
            if (title == book.getTitle()) {
                books.remove(book);
                this.noOfBooks--;
                break;
            }
        }
    }

    public void display() {
        for (Book book: books) {
            System.out.println();
            book.display();
        }
    }

    public boolean isEmpty() {
        if (books.size() == 0)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Book b1 = new Book("W pustyni", "Jacuś", 100);
        Book b2 = new Book("Moniczka", "Jakub Slowiak", 50);
        Bookcase bookcase1 = new Bookcase("Ulubiona bookcase", "Sypialnia");
        bookcase1.add(b1);
        bookcase1.add(b2);
        bookcase1.remove("Moniczka");
        bookcase1.display();
    }
}
