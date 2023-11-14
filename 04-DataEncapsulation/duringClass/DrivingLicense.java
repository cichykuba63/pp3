package duringClass;

public class DrivingLicense {
    private String name, surname, address, postalCode, city;
    private int licenseNo, yearOfIssue;
    private char drivingCat;

    public void setName(String name) {
        String s1 = "";
        String s2 = "";

        s1 += name.charAt(0);
        s2 += name.substring(1);

        this.name = String.join("", s1.toUpperCase(), s2.toLowerCase());
    }

    public String getName() {
        return this.name;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Surname: " + this.surname);
        System.out.println("Address: " + this.address);
        System.out.println("Postal code: " + this.postalCode);
        System.out.println("City: " + this.city);
        System.out.println("License number: " + this.licenseNo);
        System.out.println("Year of issue: " + this.yearOfIssue);
        System.out.println("Driving Category: " + this.drivingCat);
    }

    public static void main(String[] args) {
        DrivingLicense d = new DrivingLicense();

        d.setName("JAKUB");
        System.out.println(d.getName());
    }
}
