
import java.beans.*;

public class ColorsBeanInfo extends SimpleBeanInfo {
  public PropertyDescriptor[] getPropertyDiscriptors() {
    try {
      PropertyDescriptor rectangular = new PropertyDescriptor("rectangular", Colors.class);
      PropertyDescriptor pd[] = { rectangular };
      return pd;
    } catch (Exception exc){
      System.out.println("Error: " + exc);
    }
    return null;
  }
}
