public class StudentTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Peter";
        s.age = 21;
        System.out.println(s.name + " " + s.age);
        
        Student s2 = new Student();
        s2.name = "Jacob";
        s2.age = 22;
        s2.sayHello();
        s2.displayName();
        s2.displayAge();

        Student s3 = new Student();
        s3.name = "Franek";
        s3.age = 21;
        s3.sayHello();
        s3.displayName();
        s3.displayAge();

        Student s4 = new Student();
        s4.name = "Szymon";
        s4.age = 22;
        s4.studentIdCard = 123321;
        s4.isIdCardValid = false;
        s4.semesterNumber = 3;
        s4.averageGrade = 3.25;
        s4.displayPrimaryStudentInfo();
        s4.changeIdStatus(true);
        s4.displayStudentInfo();

        Student s5 = new Student();
        s5.name = "Krystian";
        s5.age = 21;
        s5.studentIdCard = 542123;
        s5.isIdCardValid = true;
        s5.semesterNumber = 2;
        s5.averageGrade = 4.52;
        s5.displayPrimaryStudentInfo();
        s5.changeIdStatus(false);
        s5.displayStudentInfo();
    }
}
