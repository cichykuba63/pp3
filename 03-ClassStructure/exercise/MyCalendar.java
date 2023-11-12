package exercise;

public class MyCalendar {
    static int year = 2023,
            month = 12,
            day = 31;

    static String myDate() {
        return String.format("%d-%02d-%02d", year, month, day);
    }

    static int days() {
        int sum = 0;
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month != 1) {
            for (int c = 1; c < month; c++) {
                sum += days[c - 1];
            }
            sum += day;
        } else {
            sum += day;
        }

        return sum;
    }

    static String monthName(int number) {
        String[] month = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December" };

        return month[number - 1];
    }
}
