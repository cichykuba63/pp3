public class Book {
    int price,
            yearOfProduction,
            pages,
            read;
    String title,
            author;
    boolean isOpen;

    Book(int price, int yearOfProduction, int pages, String title, String author) {
        this.price = price;
        this.yearOfProduction = yearOfProduction;
        this.pages = pages;
        this.title = title;
        this.author = author;
        this.isOpen = false;
        this.read = 0;
    }

    void open() {
        System.out.println("You opened the book.");
        this.isOpen = true;
    }

    void close() {
        System.out.println("You closed the book.");
        this.isOpen = false;
    }

    void read(int pages) {
        if (this.isOpen == true) {
            if (pages <= this.pages && this.read + pages <= this.pages) {
                System.out.println("Reading " + pages + " pages.");
                this.read += pages;
            } else {
                System.out.println("You want to read more than amount of pages in the book.");
            }
        } else {
            System.out.println("You can't read a book that is closed.");
        }

    }
}
