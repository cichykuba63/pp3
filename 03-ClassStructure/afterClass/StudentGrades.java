package afterClass;

import java.util.*;

public class StudentGrades {
    private String studentName;
    private int numberOfGrades;
    private double[] grades;

    public StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    public StudentGrades(String name, int numberOfGrades) {
        Random rdm = new Random();
        this.numberOfGrades = rdm.nextInt(numberOfGrades);
    }

    public StudentGrades(String name) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many grades? ");
        int amount = scanner.nextInt();
        grades = new double[amount];
        
        for (int i = 0; i < amount; i++) {
            System.out.print("\nEnter " + (i + 1) + " grade: ");
            double grade = scanner.nextDouble();
            grades[i] = grade;
        }

        scanner.close();
    }

    public double lowestGrade() {
        Arrays.sort(this.grades);
        return this.grades[0];
    }

    public double highestGrade() {
        Arrays.sort(this.grades);
        return this.grades[this.grades.length - 1];
    }

    public int howManyGrades() {
        return this.grades.length;
    }

    public double average() {
        double sum = 0;
        for (double grade : grades)
            sum += grade;
        return sum / this.grades.length;
    }

    public void display() {
        System.out.printf(
                "Name: %s, Grades: %s, Number of grades: %d, Lowest grade: %.02f, Highest grade: %.02f, Average: %.02f",
                this.studentName, Arrays.toString(this.grades), this.howManyGrades(), this.lowestGrade(),
                this.highestGrade(), this.average());
    }

    public static void main(String[] args) {
        StudentGrades s1 = new StudentGrades("Amanda", new double[] { 1.0, 2.0, 3.0, 5.0, 3.5, 2.5, 1.5, 5.5 });
        StudentGrades s2 = new StudentGrades("James", new double[] { 1.0, 2.0, 2.0, 6, 4.5, 1.5, 3.5, 4.5, 5.0 });
        StudentGrades s3 = new StudentGrades("James");

        s3.display();
    }
}
