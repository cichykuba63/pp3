package duringClass;

public class SMS extends Message {
    private String phoneNumber;
    
    public SMS(String phoneNumber) {
        super();
        this.phoneNumber = phoneNumber;
    }

    public SMS(String text, String phoneNumber) {
        super(text);
        this.phoneNumber = phoneNumber;
    }

    public String getText() {
        return this.text;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void send() {
        System.out.println("To: " + this.getPhoneNumber());
        System.out.println("Message: " + this.text);
        System.out.println("Length: " + this.charNumber());
    }
}
