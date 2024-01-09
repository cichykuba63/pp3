package duringClass;
import java.util.ArrayList;

public class Folder {
    private String name, dateOfCreation, permit;
    private int noOfFiles;
    private ArrayList<File> files;

    public Folder(String name, String dateOfCreation, String permit) {
        this.name = name;
        this.dateOfCreation = dateOfCreation;
        this.permit = permit;
        this.noOfFiles = 0;
        files = new ArrayList<File>();
    }

    public boolean isEmpty() {
        if (noOfFiles == 0)
            return true;
        else
            return false;
    }

    public void delete() {
        this.noOfFiles = 0;
    }

    public void add(String name, String location, String dateOfCreation, int size) {
        files.add(new File(name, location, dateOfCreation, size));
        this.noOfFiles++;
    }

    public void remove(String name) {
        for (File file: files) {
            if (name == file.getName()) {
                files.remove(file);
                this.noOfFiles--;
                break;
            }
        }
    }

    public void display() {
        for (File file: files) {
            file.display();
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Folder f1 = new Folder("Nice", "2020-01-20", "all");
        f1.add("Game1.exe", "D:/games", "2020-01-20", 203);
        f1.add("Photo.jpg", "C:/system32", "2020-10-10", 2);
        f1.remove("Game1.exe");
        f1.display();
    }
}
