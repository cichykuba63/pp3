package duringClass;

public class File {
    private String name, location, dateOfCreation;
    private int size;

    public File(String name, String location, String dateOfCreation, int size) {
        this.name = name;
        this.location = location;
        this.dateOfCreation = dateOfCreation;
        this.size = size;
    }

    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Location: " + this.location);
        System.out.println("Date: " + this.dateOfCreation);
        System.out.println("Size: " + this.size);
    }
}
