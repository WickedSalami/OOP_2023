package Time;

public class MyTime {
    private int hour;
    private int minute;
    private int seconds;
    private boolean meridian;

    public MyTime(int hour, int minute, int seconds, boolean meridian) {
        this.hour = hour;
        this.minute = minute;
        this.seconds = seconds;
        this.meridian = meridian;
    }

    // Getters
    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSeconds() {
        return seconds;
    }

    public boolean isMeridian() {
        return meridian;
    }

    //Setters
    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public void setMeridian(boolean meridian) {
        this.meridian = meridian;
    }

    public void advanceTime(int seconds) {
        int totalSeconds = (hour % 12) * 3600 + minute * 60 + this.seconds + seconds;
        hour = (totalSeconds / 3600) % 12;
        if (hour == 0) {
            hour = 12;
        }
        minute = (totalSeconds % 3600) / 60;
        this.seconds = totalSeconds % 60;
    }


    public void tickByHour() {
        hour = (hour + 1) % 12;
        if(hour == 0) {
            hour = 12;
            meridian = !meridian;
        }
    }

    public void tickByMinute() {
        minute = (minute + 1) % 60;
        if (minute == 0) {
            tickByHour();
        }
    }

    public void tickBySecond() {
        seconds = (seconds + 1) % 60;
        if (seconds == 0) {
            tickByMinute();
        }
    }

    public void display12Hour() {
        String meridianStr = meridian ? "AM" : "PM";
        System.out.printf("%02d:%02d:%02d %s%n", hour, minute, seconds, meridianStr);
    }

    public void display24Hour() {
        System.out.printf("%02d:%02d:%02d%n", hour, minute, seconds);
    }

    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d %s", hour, minute, seconds, meridian ? "AM" : "PM");
    }
}