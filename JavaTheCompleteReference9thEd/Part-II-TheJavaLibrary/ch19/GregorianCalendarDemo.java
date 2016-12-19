
import java.util.*;

class GregorianCalendarDemo {
  public static void main(String args[])
  {
    String months[] = {
      "Jan", "Feb", "Mar", "Apr", "May",
      "Jun", "Jul", "Aug", "Sep", "Oct",
      "Nov", "Dec"};

    GregorianCalendar gcalendar = new GregorianCalendar();

    int year = gcalendar.get(Calendar.YEAR);

    System.out.print("Date: ");
    System.out.print(months[gcalendar.get(Calendar.MONTH)]);
    System.out.print(" " + gcalendar.get(Calendar.DATE) + " ");
    System.out.println(gcalendar.get(Calendar.YEAR));

    System.out.print("Time: ");
    System.out.print(gcalendar.get(Calendar.HOUR) + ":");
    System.out.print(gcalendar.get(Calendar.MINUTE) + ":");
    System.out.println(gcalendar.get(Calendar.SECOND));

    //test if current year is a leap-year
    if(gcalendar.isLeapYear(year)) System.out.println("current year is leap-year");
    else System.out.println("current year is not a leap year");
  }
}
