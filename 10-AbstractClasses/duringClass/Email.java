package duringClass;

public class Email extends Message {
    private String subject, address;

    public Email(String address, String subject) {
        super();
        this.address = address;
        this.subject = subject;
    }

    public Email(String text, String address, String subject) {
        super(text);
        this.address = address;
        this.subject = subject;
    }

    public String getText() {
        return this.text;
    }

    public String getSubject() {
        return this.subject;
    }

    public String getAddress() {
        return this.address;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void send() {
        System.out.println("To: " + this.getAddress());
        System.out.println("Subject: " + this.getSubject());
        System.out.println("Message: " + this.text);
    }
}
