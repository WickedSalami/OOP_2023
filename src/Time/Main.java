package Time;

public class Main {
    public static void main(String[] args) {
        MyTime time = new MyTime(12, 59, 59, false);

        System.out.println("Initial Time:");
        System.out.println(time);
        time.advanceTime(10);
        System.out.println("Time after advancing by 10 seconds:");
        System.out.println(time);
        time.tickByHour();
        System.out.println("Ticked by an hour:");
        System.out.println(time);
        time.tickByMinute();
        System.out.println("Ticked by a minute:");
        System.out.println(time);
        time.tickBySecond();
        System.out.println("Ticked by a second:");
        System.out.println(time);
        System.out.println("12-Hour Format:");
        time.display12Hour();
        System.out.println("24-Hour Format:");
        time.display24Hour();
    }
}