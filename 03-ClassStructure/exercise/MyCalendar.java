package exercise;

public class MyCalendar {
    static int year = 2023,
               month = 11,
               day = 4;

    static String myDate() {
        if (day < 10 && month < 10) {
            return year + "-" + "0" + month + "-" + "0" + day;
        } else if (day < 10 && month >= 10) {
            return year + "-" + month + "-" + "0" + day;
        } else if (day >= 10 && month < 10) {
            return year + "-" + "0" + month + "-" + day;
        } else {
            return year + "-" + month + "-" + day;
        }
    }

    static int days() {
        return month * 30 + day;
    }

    static String monthName(int number) {
        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        return month[number - 1];
    }
}
