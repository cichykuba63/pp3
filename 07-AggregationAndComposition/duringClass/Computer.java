package duringClass;

public class Computer {
    private String brand, model, system;
    private boolean isOn;
    Processor processor;

    public Computer(String brand, String model, String system, int cores) {
        this.brand = brand;
        this.model = model;
        this.system = system;
        this.isOn = false;
        processor = new Processor(brand, model, cores);
    }

    public void switchOn() {
        if (!this.isOn) {
            this.isOn = true;
            this.processor.switchOn();
        } else
            System.out.println("Your computer is already on.");
    }

    public void switchOff() {
        if (this.isOn) {
            this.isOn = false;
            this.processor.switchOff();
        } else
            System.out.println("Your computer is already off.");
    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public String getSystem() {
        return this.system;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void reset() {
        this.isOn = false;
        this.isOn = true;
    }

    public void getStatus() {
        String isOn = this.isOn() ? "On" : "Off";
        System.out.println("Your computer is: " + isOn);
        System.out.println("Computer's brand: " + this.getBrand());
        System.out.println("Computer's model: " + this.getModel());
        System.out.println("Computer's system: " + this.getSystem());
        System.out.println("Processor: " + processor.getCores() + " cores");
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public static void main(String[] args) {
        Computer c1 = new Computer("AMD", "Storm", "Win 10", 8);

        c1.getStatus();
        c1.processor.displayData();

        c1.switchOn();
        System.out.println();
        c1.getStatus();
        c1.processor.displayData();
    }
}
