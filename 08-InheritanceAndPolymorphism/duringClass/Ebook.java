package duringClass;

public class Ebook extends Book {
    private String file;

    public Ebook(String title, String author, String file) {
        super(title, author);
        this.file = file;
    }
    
    public String getFile() {
        return this.file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public void display() {
        System.out.println("Book's title: " + this.getTitle());
        System.out.println("Book's author: " + this.getAuthor());
        System.out.println("Book's file: " + this.getFile());
    }

    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("W pustyni i w puszczy", "Henryk Sienkiewicz", "wPustyni.pdf");

        ebook1.display();
    }
}
