package duringClass;
import java.util.ArrayList;

public class Book {
    private String title, author;
    private int pages;
    private ArrayList<Chapter> chapters;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        chapters = new ArrayList<Chapter>();
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
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Pages: " + this.getPages());
        System.out.println();
        System.out.println("Chapters:");

        if (chapters.size() != 0) {
            for (Chapter chapter: chapters) {
                chapter.display();
                System.out.println();
            }
        } else {
            System.out.println("No chapters");
        }
    }

    public void addChapter(int number, int numberOfPages, int startingPage, String title) {
        chapters.add(new Chapter(number, numberOfPages, startingPage, title));
    }

    public void removeChapter(String title) {
        for (Chapter chapter: chapters) {
            if (title == chapter.getTitle()) {
                chapters.remove(chapter);
                break;
            }
        }
    }

}
