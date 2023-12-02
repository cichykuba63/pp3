package duringClass;

public class Processor {
    private int cores;
    private String brand, model;
    private boolean isOn;
    
    public Processor() {
        this.isOn = false;
    }

    public Processor(String brand, String model, int cores) {
        this.cores = cores;
        this.brand = brand;
        this.model = model;
        this.isOn = false;
    }

    public void switchOn() {
        if (!this.isOn)
            this.isOn = true;
        else
            System.out.println("Your processor is already on.");
    }

    public void switchOff() {
        if (this.isOn)
            this.isOn = false;
        else
            System.out.println("Your processor is already off.");
    }

    public int getCores() {
        return this.cores;
    }

    public boolean isOn() {
        return this.isOn;
    }

    public void displayData() {
        String isOn = this.isOn() ? "On" : "Off";
        System.out.println("Your processor is: " + isOn);
    }
}
