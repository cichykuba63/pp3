package afterClass;

public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        if (pages > 0) {
            this.title = title;
            this.pages = pages;
        } else
            System.out.println("Insert proper data.");
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages > 0)
            this.pages = pages;
        else
            System.out.println("Insert proper data.");
    }

    public static void main(String[] args) {
        Book b = new Book("W pustyni i w puszczy", 200);

        System.out.println(b.getPages());
        System.out.println(b.getTitle());
        b.setPages(0);
        b.setTitle("Babcia w tarapatach");
        System.out.println(b.getPages());
        System.out.println(b.getTitle());
    }
}
