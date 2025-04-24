
package inheritanceclassprac;

import inheritanceclassprac.spec.Child;
import inheritanceclassprac.spec.Female;


public class InheritanceClassPrac {

    
    public static void main(String[] args) {
   
         Female f=new Female();
         
        Child c=new Child();
        
        c.setCell(258);
        c.setColor("pink");
        f.setDressName("saree");
        f.setPrice(5000);
        
        
        
        
        
        System.out.println("cell :"+c.getCell());
        System.out.println("color :"+c.getColor());
        System.out.println("dress :"+f.getDressName());
        System.out.println("price :"+f.getPrice());
        
            
    
    
    
    }
    
    
    
    
}
