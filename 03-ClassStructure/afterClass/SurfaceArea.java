package afterClass;

import java.lang.Math;

public class SurfaceArea {
    static double cuboid(double a, double b, double c) {
        return a * b * c;
    }

    static double sphere(double r) {
        return 4 * Math.PI * Math.pow(r, 2);
    }

    static double cone(double r, double l) {
        return Math.PI * Math.pow(r, 2) + Math.PI * r * l;
    }

    public static void main(String[] args) {
        System.out.println((int)SurfaceArea.cuboid(1, 2, 3));
        System.out.println(SurfaceArea.cuboid(1.5, 2.2, 3.43));
        System.out.printf("%.4f\n", SurfaceArea.sphere(2));
        System.out.printf("%.4f\n", SurfaceArea.sphere(2.5));
        System.out.printf("%.4f", SurfaceArea.cone(1, 2));
    }

}
