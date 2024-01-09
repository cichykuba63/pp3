package afterClass;

public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("File name: " + this.getFileName());
    }
}
