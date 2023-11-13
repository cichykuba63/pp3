package afterClass;

public class Point {
    private int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public boolean isX() {
        if (this.y == 0)
            return true;
        else
            return false;
    }

    public boolean isY() {
        if (this.x == 0)
            return true;
        else
            return false;
    }

    @Override
    public String toString() {
        return "P(" + this.x + "," + this.y + ")";
    }

    public static void main(String[] args) {
        Point p = new Point(3, 0);

        System.out.println(p.isX());
        System.out.println(p.isY());
        System.out.println(p.toString());
    }
}
