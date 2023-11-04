package exercise;

public class SurfaceArea {
    static float rectangle(float x, float y) {
        return x * y;
    }

    static float circle(float radius) {
        final float PI = 3.14f;
        
        return (radius * radius) * PI;
    }

    static float triangle(float base, float height) {
        return (base * height) / 2;
    }
}