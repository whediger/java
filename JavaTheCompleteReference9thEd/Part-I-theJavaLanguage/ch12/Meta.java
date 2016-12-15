
import java.lang.annotation.*;
import java.lang.reflect.*;

//an annotation type delaration
@Retention (RetentionPolicy.RUNTIME)
@interface MyAnno {
  String str();
  int val();
}

class Meta {
  //annotate a method
  @MyAnno(str = "Annotation Example", val = 100)
    public static void myMeth(){
      Meta ob = new Meta();

      //obtain annotation and display values of the members
      try {
        //first get class object
        Class<?> c = ob.getClass();

        //now get method ob that represents this method;
        Method m = c.getMethod("myMeth");

        //next annotation for this class
        MyAnno anno = m.getAnnotation(MyAnno.class);

        //lastly, displaythe values
        System.out.println(anno.str() + " " + anno.val());
      } catch (NoSuchMethodException exc) {
        System.out.println("no such method " + exc);
      }
    }

    public static void main(String args[])
    {
      myMeth();
    }
}
