
import java.lang.annotation.*;
import java.lang.reflect.*;


//an annotation that includes defaults
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str() default "Testing";
  int val() default 9000;
}

class Meta3 {

  //annotate a method using the default values
  @MyAnno()
  public static void myMeth() {
    Meta3 ob = new Meta3();

    //get the annotation for this method
    //and display the member values
    try {
      Class<?> c = ob.getClass();

      Method m = c.getMethod("myMeth");

      MyAnno anno = m.getAnnotation(MyAnno.class);

      System.out.println(anno.str() + " " + anno.val());
    } catch (NoSuchMethodException exc){
      System.out.println("no such method - " + exc);
    }
  }

  public static void main(String args[])
  {
    myMeth();
  }
}
