package afterClass;

public class Calculate {
    public static void main(String[] args) {
        String str = "Have a nice day!";

        System.out.println("Length: " + str.length());
        System.out.println("First 9 characters: " + str.substring(0, 9));
        System.out.print("Ends with day!: " + str.endsWith("day!"));
        System.out.println("\nEmpty: " + str.isEmpty());
        System.out.println("Last occurence of e: " + str.lastIndexOf("e"));
        System.out.println(str.replace(" ", "-"));
        System.out.println(str.toUpperCase());
    }
}
