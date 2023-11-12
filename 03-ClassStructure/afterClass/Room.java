package afterClass;

public class Room {
    private int number, beds;
    private boolean isOccupied = false;
    private String guestName = "";

    public Room(int number) {
        this.number = number;
        this.beds = 2;
    }

    public Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }

    int getBeds() {
        return this.beds;
    }

    void checkIn(String guestName) {
        this.guestName = guestName;
        this.isOccupied = true;
    }

    void checkOut() {
        this.guestName = "";
        this.isOccupied = false;
    }

    boolean isOccupied() {
        return this.isOccupied;
    }

    @Override
    public String toString() {
        String isEmpty = this.guestName.isEmpty() ? "No guest name" : "Guest name: " + this.guestName;
        String isOccupied = this.isOccupied() ? "Yes" : "No";

        return "Number: " + this.number + " Beds: " + this.beds + " " + isEmpty + " Occupied: " + isOccupied;
    }

    static void allRoomsStatus(Room[] rooms) {
        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i].toString());
        }
    }

    static void roomsWithBeds(Room[] rooms, int beds) {
        for (Room r : rooms) {
            if (r.getBeds() >= beds) {
                System.out.println(r.toString());
            }
        }
    }

    static void vacantRooms(Room[] rooms) {
        int vacant = 0;
        int occupied = 0;

        for (Room r: rooms) {
            if (r.isOccupied()) 
                occupied++;
            else
                vacant++;
        }

        System.out.println("Occupied rooms: " + occupied);
        System.out.println("Vacant rooms: " + vacant);
    }

    static void vacantBeds(Room[] rooms) {
        int beds = 0;

        for (Room r: rooms) {
            if (!r.isOccupied())
                beds += r.getBeds();
        }

        System.out.println("Vacant beds: " + beds);
    }

    public static void main(String[] args) {
        Room[] room = new Room[6];

        for (int i = 0; i < room.length; i++) {
            if (i < 3) {
                room[i] = new Room(i + 1, 2);
            } else if (i >= 3 && i != 5) {
                room[i] = new Room(i + 1, 3);
            } else {
                room[i] = new Room(i + 1, 1);
            }
        }

        room[0].checkIn("Kornel");
        room[1].checkIn("Kamila");

        Room.allRoomsStatus(room);

        System.out.println("----------------");

        Room.roomsWithBeds(room, 3);
        
        System.out.println("----------------");

        Room.vacantRooms(room);
        
        System.out.println("----------------");

        Room.vacantBeds(room);

        System.out.println("----------------");

    }
}
