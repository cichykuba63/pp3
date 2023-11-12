package afterClass;

public class Clock {
    private int hour, minute, alarmHour, alarmMinute;

    public Clock() {
        this.hour = this.minute = 0;
    }

    public Clock(int hour, int minute) {
        if (this.check(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Insert proper data.");
        }
    }

    public boolean check(int hour, int minute) {
        if (hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59)
            return true;
        else
            return false;
    }

    public void setClock(int hour, int minute) {
        if (this.check(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Insert proper data.");
        }

        if (this.hour == this.alarmHour && this.minute == this.alarmMinute)
            this.runAlarm();
    }

    public void setClock() {
        this.hour = this.minute = 0;
    }

    public void displayTime() {
        System.out.printf("%02d:%02d\n", this.hour, this.minute);
    }

    public void addOneMinute() {
        if (this.minute < 59)
            this.minute++;
        else if (this.minute == 59 && this.hour < 23){
            this.minute = 0;
            this.hour++;
        } else
            this.minute = this.hour = 0;

        if (this.hour == this.alarmHour && this.minute == this.alarmMinute)
            this.runAlarm();
    }

    public void setAlarm(int hour, int minute) {
        if (this.check(hour, minute)) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Insert proper data.");
        }

        if (this.hour == this.alarmHour && this.minute == this.alarmMinute)
            this.runAlarm();
    }

    public void runAlarm() {
        System.out.println("beep-beep-beep-beep!");
    }

    public static void main(String[] args) {
        Clock c1 = new Clock(12, 47);

        c1.displayTime();
        c1.setClock(18, 14);
        c1.displayTime();
        c1.setClock(9, 3);
        c1.displayTime();
        c1.setClock(23, 58);
        c1.displayTime();
        c1.setAlarm(23, 59);
        c1.addOneMinute();
    }

}
