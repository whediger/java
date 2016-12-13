
import java.lang.annotation.*;
import java.lang.reflect.*;

//a marker annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyMarker { }

class Marker {
  //annotate a marker using RUNTIME
  //Notice that no "( )" is needed
  @MyMarker
  public static void myMeth(){
    Marker ob = new Marker();

    try {
      Method m = ob.getClass().getMethod("MyMeth");

      //determine if annotation is present
      if(m.isAnnotationPresent(MyMarker.class))
        System.out.println("My marker is present");
    } catch (NoSuchMethodException exc){
      System.out.println(exc);
    }
  }

  public static void main(String args[])
  {
    myMeth();
  }
}
