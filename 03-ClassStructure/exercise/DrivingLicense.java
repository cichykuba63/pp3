package exercise;

public class DrivingLicense {
    private String name,
            surname,
            address,
            postalCode,
            drivingCategory,
            city;
    private int drivingNo,
            yearOfIssue;

    void display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Surname: " + this.getSurname());
        System.out.println("Address: " + this.getAddress());
        System.out.println("City: " + this.getCity());
        System.out.println("Postal code: " + this.getPostalCode());
        System.out.println("Driving license number: " + this.getDrivingNo());
        System.out.println("Year of issue: " + this.getYearOfIssue());
        System.out.println("Driving category: " + this.getDrivingCategory());
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPostalCode() {
        return this.postalCode;
    }

    public String getDrivingCategory() {
        return this.drivingCategory;
    }

    public String getCity() {
        return this.city;
    }

    public int getDrivingNo() {
        return this.drivingNo;
    }

    public int getYearOfIssue() {
        return this.yearOfIssue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public void setDrivingCategory(String drivingCategory) {
        this.drivingCategory = drivingCategory;
    }

    public void setDrivingNo(int drivingNo) {
        this.drivingNo = drivingNo;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
