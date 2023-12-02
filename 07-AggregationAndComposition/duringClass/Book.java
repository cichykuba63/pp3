package duringClass;

public class Book {
    private String title, author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPages() {
        return this.pages;
    }

    public void display() {
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Title: " + this.getTitle());
        System.out.println("Pages: " + this.getPages());
    }
}
