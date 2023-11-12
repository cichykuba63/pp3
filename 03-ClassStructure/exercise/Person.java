package exercise;

import java.lang.Math;

public class Person {
    String name;
    double weight, height;

    Person(String name) {
        this.name = name;
    }

    Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height / 100;
    }

    void setWeightAndHeight(double weight, double height) {
        this.weight = weight;
        this.height = height / 100;
    }

    double calculateBMI() {
        return weight / Math.pow(height, 2);
    }

    void displayRecord() {
        if (this.calculateBMI() >= 18.5 && this.calculateBMI() <= 24.9) {
            System.out.printf("Your BMI is good - %.2f", this.calculateBMI());
        } else if (this.calculateBMI() < 18.5) {
            System.out.printf("Your BMI is too low - %.2f", this.calculateBMI());
        } else {
            System.out.printf("Your BMI is too high - %.2f", this.calculateBMI());
        }
    }

    public static void main(String[] args) {
        Person p1 = new Person("Jakub");
        Person p2 = new Person("Kornel");
        Person p3 = new Person("Szymon");

        p1.setWeightAndHeight(69, 173);
        p2.setWeightAndHeight(80, 180);
        p3.setWeightAndHeight(65, 180);

        p1.displayRecord();
        System.out.println();
        p2.displayRecord();
        System.out.println();
        p3.displayRecord();
    }
}
