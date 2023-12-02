package duringClass;

public class Audiobook extends Book{
    private int minutes, seconds;

    public Audiobook(String title, String author, int minutes, int seconds) {
        super(title, author);
        this.minutes = minutes;
        if (this.checkSeconds(seconds))
            this.seconds = seconds;
    }

    public boolean checkSeconds(int seconds) {
        if (seconds >= 0 && seconds <= 59)
            return true;
        else
            return false;
    }

    public int getMinutes() {
        return this.minutes;        
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setSeconds(int seconds) {
        if (this.checkSeconds(seconds))
            this.seconds = seconds;
    }

    public void display() {
        System.out.println("Book's title: " + this.getTitle());
        System.out.println("Book's author: " + this.getAuthor());
        System.out.println("Book's duration: " + this.getMinutes() + " minutes, " + this.getSeconds() + " seconds");
    }
    
    public static void main(String[] args) {
        Audiobook abook1 = new Audiobook("W pustyni i w puszczy", "Henryk Sienkiewicz", 130, 50);

        abook1.display();
    }
}
