public class Euro {
    static double buy = 4.5940,
                  sell = 4.6250;

    static double difference() {
        return sell - buy;
    }

    public static void main(String[] args) {
        System.out.println("Bank buys EUR: " + buy);
        System.out.println("Bank sells EUR: " + sell);
        System.out.printf("Spread: %.4f", Euro.difference());
    }
}
