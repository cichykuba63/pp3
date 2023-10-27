public class Vehicle {
    public static void main(String[] args) {
        int vehicleSpeed = 110;
        String isSpeedOkay = (vehicleSpeed >= 40 && vehicleSpeed <= 140) ? "Valid" : "Invalid";

        System.out.println("Vehicle speed: " + vehicleSpeed);
        System.out.println("Vehicle speed valid: " + isSpeedOkay);
    }
}
