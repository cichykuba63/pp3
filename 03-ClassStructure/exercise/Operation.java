package exercise;
import java.lang.Math;

public class Operation {
    public static void main(String[] args) {
        System.out.println("Max of 34 and 49 is: " + Math.max(34, 49));
        System.out.println("PI number is equal to: " + Math.PI);
        System.out.println("The absolute value of -17 is: " + Math.abs(-17));
        System.out.println("Square root of 9 / 2: " + Math.sqrt(9f / 2f));
        System.out.printf("Random number between 0 and 1: %.1f\n", Math.random());
        System.out.println("Random number between 0 and 10: " + (int)(Math.random() * 10));
        System.out.printf("Sine of 90 degrees: %.6f ", Math.sin(90));
    }
}
