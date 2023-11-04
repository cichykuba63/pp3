public class Height {
    static int height = 170;

    static double calcFeet() {
        return height * 0.032;
    }

    static double calcInch() {
        return height * 0.3937;
    }

    public static void main(String[] args) {
        System.out.println("I am " + height + " tall, i.e. " + (int)Height.calcFeet() + " feet and " + (int)Height.calcInch() + " inches.");
    }
}
