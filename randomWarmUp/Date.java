


public class Date {

  private int year;
  private int month;
  private int day;


  public Date(){
    this.year = 2016;
    this.month = 11;
    this.day = 15;
  }

  public Date(int year, int month, int day){
    this.year = year;
    this.month = month;
    this.day = day;
  }


  public static void main(String[] args){
    Date today = new Date();
    System.out.println(today.year + " " + today.month + " " + today.day);
    Date newDate = new Date(2016, 6, 3);
    System.out.println(newDate.year + " " + newDate.month + " " + newDate.day);
  }
}
