package afterClass;

public class InternetDevice {
    private String deviceName;
    private boolean isConnected = false;
    static private int connectedDevices = 0;

    public InternetDevice(String name) {
        this.deviceName = name;
    }

    public void connect() {
        if (!this.isConnected) {
            this.isConnected = true;
            connectedDevices++;
            System.out.println("Connected successfully!");
        } else 
            System.out.println("Your device is already connected!");
    }

    public void disconnect() {
        if (this.isConnected) {
            this.isConnected = false;
            connectedDevices--;
            System.out.println("Disconnected successfully!");
        } else
            System.out.println("Your device is already disconnected!");
    }

    public boolean isConnected() {
        return this.isConnected;
    }

    public void displayStatus() {
        String isConnected = this.isConnected() ? "Yes" : "No";
        System.out.printf("\nName: %s, Connected: %s, Connected devices: %0d", this.deviceName, isConnected, connectedDevices);
    }

    public static void displayConnections() {
        System.out.println("Connected divices: " + connectedDevices);
    }

    public static void main(String[] args) {
        InternetDevice d1 = new InternetDevice("Phone");
        InternetDevice d2 = new InternetDevice("PC");
        InternetDevice d3 = new InternetDevice("Laptop");
        InternetDevice d4 = new InternetDevice("TV");
        InternetDevice d5 = new InternetDevice("Iphone");

        d1.connect();
        d2.connect();
        d2.disconnect();

        InternetDevice.displayConnections();
    }
}
