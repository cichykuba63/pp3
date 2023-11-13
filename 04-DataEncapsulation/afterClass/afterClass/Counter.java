package afterClass;

public class Counter {
    private int counter;

    public Counter() {
        this.counter = 0;
    }

    public void increase() {
        this.counter++;
    }

    public void decrease() {
        this.counter--;
    }

    public void increase(int number) {
        this.counter += number;
    }

    public void decrease(int number) {
        this.counter -= number;
    }

    public int value() {
        return this.counter;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();

        System.out.println(c1.value());
        c1.increase();
        c1.increase();
        c1.decrease();
        c1.increase(5);
        c1.decrease(2);
        System.out.println(c1.value());
    }
}
