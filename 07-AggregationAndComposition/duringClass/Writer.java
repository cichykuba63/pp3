package duringClass;
import java.util.ArrayList;
import java.util.Arrays;

public class Writer {
    private String name;
    private int age;
    private ArrayList<Book> arr = new ArrayList<Book>();

    public Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public int getNoOfBooks() {
        return arr.size();
    }

    public void writeBook(String title, int pages) {
        arr.add(new Book(title, this.getName(), pages));
    }

    public void showBooks() {
        for (Book b: arr) {
            b.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Janusz", 31);

        w1.writeBook("Jak zarobić 1 mln złotych", 500);
        w1.writeBook("Jak stracić 1 mln złotych", 5);
        w1.showBooks();
    }
}
