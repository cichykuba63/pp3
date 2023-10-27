public class Student {
    String name;
    int age;
    int studentIdCard;
    boolean isIdCardValid;
    int semesterNumber;
    double averageGrade;

    void sayHello() {
        System.out.println("Hello from " + name);
    }

    void displayName() {
        System.out.println("Student's name: " + name);
    }

    void displayAge() {
        System.out.println("Age: " + age);
    }

    void displayPrimaryStudentInfo() {
        System.out.println("Student's name: " + name);
        System.out.println("Age: " + age);
        System.out.println("ID number card: " + studentIdCard);
    }

    void changeIdStatus(boolean valid) {
        isIdCardValid = valid;
    }

    void displayStudentInfo() {
        System.out.println("Student's name: " + name);
        System.out.println("Student's ID card: " + studentIdCard);
        System.out.println(isIdCardValid == true ? "Valid" : "Invalid");
    }
}
