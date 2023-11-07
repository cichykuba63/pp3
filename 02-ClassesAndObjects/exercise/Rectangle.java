public class Rectangle {
    int a, b;

    Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void displayDimension() {
        System.out.println("a is " + this.a);
        System.out.println("b is " + this.b);
    }

    void displayPerimeters() {
        System.out.println("Perimeters of the rectangle (" + this.a + "," + this.b + ") is equal: " + (a * 2 + b * 2));
    }

    void displayArea() {
        System.out.println("Surface area of the rectangle (" + this.a + "," + this.b + ") is equal: " + a * b);
    }


    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(1, 2);

        r1.displayDimension();
        System.out.println();
        r1.displayPerimeters();
        System.out.println();
        r1.displayArea();
    }
}
