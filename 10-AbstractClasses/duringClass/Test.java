package duringClass;

public class Test {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(5, 4);
        Triangle t1 = new Triangle(5, 10);
        Circle c1 = new Circle(8);

        System.out.println("Rectangle area: " + r1.area());
        System.out.println();
        System.out.println("Triangle area: " + t1.area());
        System.out.println();
        System.out.println("Circle area: " + String.format("%.3f", c1.area()));
    }
}
