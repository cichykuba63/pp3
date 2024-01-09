package duringClass;

public abstract class Message {
    protected String text;

    public Message() {
        this.text = "";
    }

    public Message(String text) {
        this.text = text;
    }

    public abstract String getText();
    public abstract void setText(String text);
    public abstract void send();

    public int charNumber() {
        char[] letters = text.toCharArray();
        int sum = 0;

        for (int i = 0; i < letters.length; i++) {
            sum++;
        }

        return sum;
    }
}
