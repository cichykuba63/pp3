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

    public void writeBook(Book book) {
        arr.add(book);
    }

    public void showBooks() {
        for (Book b: arr) {
            b.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Writer w1 = new Writer("Janusz", 31);
        Book b1 = new Book("W pustyni", w1.getName(), 200);

        w1.writeBook(b1);
        b1.addChapter(1, 30, 1, "Beginning");
        b1.addChapter(2, 30, 30, "Middle");
        b1.addChapter(3, 30, 60, "The End");

        b1.display();
    }
}
