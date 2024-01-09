package duringClass;

public class Chapter {
    private int number, numberOfPages, startingPage;
    private String title;

    public Chapter(int number, int numberOfPages, int startingPage, String title) {
        this.number = number;
        this.numberOfPages = numberOfPages;
        this.startingPage = startingPage;
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public int getNumber() {
        return this.number;
    }

    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public int getStartingPage() {
        return this.startingPage;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Number of Chapter: " + this.number);
        System.out.println("Starting page: " + this.startingPage);
        System.out.println("Number of pages: " + this.numberOfPages);
    }
}
