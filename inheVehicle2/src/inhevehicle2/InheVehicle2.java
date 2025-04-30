
package inhevehicle2;

import inhevehicle2.vehi.Truck;
import java.io.File;


public class InheVehicle2 {

    public static void main(String[] args) {
       
        
        Truck t=new Truck();
           t.setRegularPrice(5000);
           t.setWeight(2010);
           t.setSpeeed(80);
           
      //  t.getRegularPrice();
      //   t.getWeight();
      // t.getSpeeed();
       
        
      System.out.println(t.getSalePrice());
        System.out.println("Speed : "+t.getSpeeed());
        
        
        
    }
    
}
