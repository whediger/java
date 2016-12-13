
import java.lang.annotation.*;
import java.lang.reflect.*;

//a single member annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {
  int value(); //this variable name must be value
}

class Single {

  //annotate a method using single-member annotation
  @MySingle(100)
  public static void myMeth(){
    Single ob = new Single();

    try {
      Method m =ob.getClass().getMethod("myMeth");

      MySingle anno = m.getAnnotation(MySingle.class);

      System.out.println(anno.value());
    } catch (NoSuchMethodException exc){
      System.out.println(exc);
    }
  }

  public static void main(String args[])
  {
    myMeth();
  }
}
