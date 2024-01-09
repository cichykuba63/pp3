package afterClass;

public class Book {
    private String title, author;

    public Book(String title, String author, String name, String city) {
        this.title = title;
        this.author = author;
    }   

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }
}
