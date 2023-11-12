package afterClass;

public class Math {
    static int range(double x, double y) {
        return (int)(y - x + 1);
    }

    static double sum(double x, double y) {
        double sum = 0;

        for (double c = x; c <= y; c++) {
            sum += c;
        }

        return sum;
    }

    static double mean(double x, double y) {
        return Math.sum(x, y) / Math.range(x, y);
    }

    public static void main(String[] args) {
        System.out.println(Math.range(5, 10));
        System.out.println(Math.sum(5, 10));
        System.out.println(Math.mean(5, 10));
    }
}
