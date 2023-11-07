public class Counter {
    int value;

    Counter() {
        this.value = 0;
    }

    void addOne() {
        this.value++;
    }

    void addTen() {
        this.value += 10;
    }

    void delOne() {
        this.value--;
    }

    void delTen() {
        this.value -= 10;
    }

    void defValue() {
        this.value = 0;
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        c1.addTen();
        c1.addTen();
        c1.addOne();
        c1.addOne();
        c1.addOne();
        System.out.println(c1.value);

        c2.delTen();
        c2.delTen();
        c2.delTen();
        c2.delTen();
        c2.delOne();
        c2.delOne();
        c2.delOne();
        c2.delOne();
        c2.delOne();
        c2.delOne();
        c2.delOne();
        System.out.println(c2.value);


    }
}
