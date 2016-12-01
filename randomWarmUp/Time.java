
public class Time {

  public static void main(String[] args){

    Integer hour = 14;
    Integer min = 43;
    Integer second = 32;

    Integer secondsInDay = 0;
    secondsInDay = (32+(43*60)+(14*60*60));

    Integer secondsInADay = (24*60*60);
    float percentOfDayPassed;
    percentOfDayPassed = (float) secondsInDay/secondsInADay;

    System.out.println("number of seconds since midnight: " + secondsInDay);
    System.out.println("Seconds remaining in the day: " + (secondsInADay - secondsInDay));
    System.out.println("percent of day passed: " + (percentOfDayPassed) + " %");

  }
}
