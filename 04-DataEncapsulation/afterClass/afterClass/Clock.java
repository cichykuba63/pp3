package afterClass;

public class Clock {
    private int hour, minute;

    public Clock(int hour, int minute) {
        if (this.checkHour(hour) && this.checkMinute(minute)) {
            this.hour = hour;
            this.minute = minute;
        } else {
            System.out.println("Insert proper data.");
        }
    }

    public boolean checkHour(int hour) {
        if (hour >= 0 && hour <= 23)
            return true;
        else
            return false;
    }

    public boolean checkMinute(int minute) {
        if (minute >= 0 && minute <= 59)
            return true;
        else
            return false;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        if (this.checkHour(hour))
            this.hour = hour;
        else
            System.out.println("Insert proper data.");
    }

    public void setMinute(int minute) {
        if (this.checkMinute(minute))
            this.minute = minute;
        else
            System.out.println("Insert proper data.");
    }

    public void addMinute() {
        if (this.getMinute() <= 58)
            this.setMinute(this.getMinute() + 1);
        else if (this.getMinute() > 58 && this.getHour() <= 22) {
            this.setHour(this.getHour() + 1);
            this.setMinute(0);
        }
        else {
            this.setHour(0);
            this.setMinute(0);
        }
    }

}
