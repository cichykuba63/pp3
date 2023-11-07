public class Lamp {
    boolean isOn;

    Lamp() {
        this.isOn = false;
    }

    void turnOn() {
        if (isOn == false) {
            System.out.println("Lamp has been turned on.");
            this.isOn = true;
        } else {
            System.out.println("Lamp is already on.");
        }
    }

    void turnOff() {
        if (isOn == true) {
            System.out.println("Lamp has been turned off.");
            this.isOn = false;
        } else {
            System.out.println("Lamp is already off.");
        }
    }

    void display() {
        String isOn = this.isOn == true ? "on" : "off";
        System.out.println("Your lamp is: " + isOn);
    }

    public static void main(String[] args) {
        Lamp l1 = new Lamp();
        Lamp l2 = new Lamp();

        l1.turnOn();
        l1.turnOff();
        l1.display();

        l2.turnOff();
        l2.turnOn();
        l2.display();
    }
} 