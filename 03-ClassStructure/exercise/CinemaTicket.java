package exercise;

public class CinemaTicket {
    int row, seat, price;
    static String cinemaName = "Helios";
    String filmTitle;

    CinemaTicket(int row, int seat, String filmTitle) {
        this.row = row;
        this.seat = seat;
        this.filmTitle = filmTitle;

        if (row < 3) {
            this.price = 10;
        } else {
            this.price = 25;
        }
    }

    @Override
    public String toString() {
        return "Row: " + this.row + "\nSeat: " + this.seat + "\nCinema name: " + cinemaName + "\nFilm title: " + this.filmTitle + "\nPrice: " + this.price;
    }

    void display() {
        System.out.println(this.toString());
    }

    public static void main(String[] args) {
        CinemaTicket t1 = new CinemaTicket(2, 3, "Robinson Cruzoe");
        CinemaTicket t2 = new CinemaTicket(7, 3, "Robinson Cruzoe");

        t1.display();
        System.out.println();
        t2.display();
    }
}
