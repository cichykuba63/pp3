public class Time {
    static int hours = 14,
               minutes = 27;

    static void time() {
        System.out.printf("Time: %d:%d\n", hours, minutes);
    }

    static int minFromMidnight() {
        return hours * 60 + minutes;
    }

    static int secFromMidnight() {
        return hours * 3600 + minutes * 60;
    }

    public static void main(String[] args) {
        System.out.println("Hours: " + hours);
        System.out.println("Minutes: " + minutes);
        Time.time();
        System.out.println("Minutes from midnight: " + Time.minFromMidnight());  
        System.out.println("Seconds from midnight: " + Time.secFromMidnight());  
    }
}
