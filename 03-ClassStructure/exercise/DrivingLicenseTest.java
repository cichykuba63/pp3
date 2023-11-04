package exercise;

public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense d1 = new DrivingLicense();
        d1.setName("Szymon");
        d1.setSurname("Kowalski");
        d1.setAddress("Miodowa 32");
        d1.setCity("Szczyrk");
        d1.setPostalCode("41-231");
        d1.setDrivingNo(32142);
        d1.setYearOfIssue(2020);
        d1.setDrivingCategory("B");

        d1.display();
    }
}
