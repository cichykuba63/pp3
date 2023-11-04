public class Lamp {
    boolean isOn;

    Lamp() {
        isOn = false;
    }

    void switchOn() {
        if (isOn == false) {
            System.out.println("Lamp has been switched on.");
            isOn = true;
        } else {
            System.out.println("Your lamp is already on.");
        }
    }

    void switchOff() {
        if (isOn == true) {
            System.out.println("Lamp has been switched off");
            isOn = false;
        } else {
            System.out.println("Your lamp is already off.");
        }
    }

    void isOn() {
        String isOn = this.isOn == true ? "on" : "off";
        System.out.println("Your lamp is: " + isOn);
    }

    public static void main(String[] args) {
        Lamp lamp1 = new Lamp();
        Lamp lamp2 = new Lamp();

        lamp1.switchOn();
        lamp1.switchOff();
        lamp1.isOn();

        System.out.println();

        lamp2.switchOff();
        lamp2.switchOn();
        lamp2.isOn();
    }
}
