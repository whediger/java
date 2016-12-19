
import java.util.Date;

class DateDemo {
  public static void main(String args[])
  {
    Date date = new Date();

    //display the date Object
    System.out.println(date);

    //dispay number of millis since jan 1st 1970 GMT
    long msec = date.getTime();
    System.out.println("Millis since jan 1, 1970: " + msec);
  }
}
