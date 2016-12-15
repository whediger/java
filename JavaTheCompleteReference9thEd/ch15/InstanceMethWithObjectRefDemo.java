
//use an instance method ref with different objects

interface MyFunc<T> {
  boolean func(T v1, T v2);
}

//a class that stores the temp high for the day
class HighTemp {
  private int hTemp;

  HighTemp(int ht) { hTemp = ht; }

  boolean sameTemp(HighTemp ht2){
    return hTemp == ht2.hTemp;
  }

  boolean lessThanTemp(HighTemp ht2){
    return hTemp < ht2.hTemp;
  }
}

class InstanceMethWithObjectRefDemo {

  static <T> int counter(T[] vals, MyFunc<T> f, T v){
    int count = 0;

    for(int i = 0; i < vals.length; i++)
      if(f.func(vals[i], v)) count++;

    return count;
  }

  public static void main(String args[])
  {
    int count;

    //array of temp objects
    HighTemp[] weekDayHighs = {
      new HighTemp(89), new HighTemp(82),
      new HighTemp(90), new HighTemp(89),
      new HighTemp(84), new HighTemp(85),
      new HighTemp(98), new HighTemp(84),
      new HighTemp(82), new HighTemp(89),
    };

    count = counter(weekDayHighs, HighTemp::sameTemp, new HighTemp(89));

    System.out.println(count + " had a high of 89");

    HighTemp[] weekDayHighs2 = {
      new HighTemp(19), new HighTemp(12),
      new HighTemp(10), new HighTemp(19),
      new HighTemp(14), new HighTemp(15),
      new HighTemp(18), new HighTemp(14),
      new HighTemp(12), new HighTemp(19),
    };

    count = counter(weekDayHighs2, HighTemp::sameTemp, new HighTemp(12));
    System.out.println(count + " days had a high of 12");

    //now use less than temp
    count = counter(weekDayHighs, HighTemp::lessThanTemp, new HighTemp(89));
    System.out.println(count + " days had a high less than 89");

    count = counter(weekDayHighs2, HighTemp::lessThanTemp, new HighTemp(19));
    System.out.println(count + " days had a high less than 19");
  }
}
