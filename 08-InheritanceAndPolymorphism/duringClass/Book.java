package duringClass;

public class Book{
    private String title, author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Book's title: " + this.getTitle());
        System.out.println("Book's author: " + this.getAuthor());
    }

    public static void main(String[] args) {
        Book book1 = new Book("W pustyni i w puszczy", "Henryk Sienkiewicz");
        Book book2 = new Book("Opowieści z Narnii", "C.S.Lewis");

        book1.display();
        System.out.println();
        book2.display();
    }
}