public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book(21, 2020, 203, "Lords of the rings", "Somebody Clever");
        Book book2 = new Book(40, 2019, 102, "I love my wife", "Arnold Schweiz");
        
        book1.open();
        book1.read(20);
        book1.close();

        book2.open();
        book2.read(100);
        book2.read(3);
        book2.close();

    }    
}
