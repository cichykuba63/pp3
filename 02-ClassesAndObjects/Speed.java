public class Speed {
    static short speed = 140;

    static void checkSpeed() {
        boolean isValid = speed >= 40 && speed <= 140 ? true : false;
        System.out.println("Vehicle speed: " + speed);
        System.out.println("Speed is valid: " + isValid);
    }

    public static void main(String[] args) {
        Speed.checkSpeed();
    }
}
