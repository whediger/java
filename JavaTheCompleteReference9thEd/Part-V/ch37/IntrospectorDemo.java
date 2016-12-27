
import java.awt.*;
import java.beans.*;

public class IntrospectorDemo {
  public static void main(String args[])
  {
    try {
      Class<?> c = Class.forName("Colors");
      BeanInfo beanInfo = Introspector.getBeanInfo(c);

      System.out.println("Properties: ");
      PropertyDescriptor propertyDescriptor[] = beanInfo.getPropertyDescriptors();
      for(int i = 0; i < propertyDescriptor.length; i++)
        System.out.println("\t" + propertyDescriptor[i].getName());

      System.out.println("Events: ");
      EventSetDescriptor eventSetDescriptor[] = beanInfo.getEventSetDescriptors();

      for(int i = 0; i < eventSetDescriptor.length; i++)
        System.out.println("\t" + eventSetDescriptor[i].getName());
    } catch (Exception exc) {
      System.out.println("Error: " + exc);
    }
  }
}
