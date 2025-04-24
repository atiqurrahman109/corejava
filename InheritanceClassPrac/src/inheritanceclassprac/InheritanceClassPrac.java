
package inheritanceclassprac;

import inheritanceclassprac.spec.Child;
import inheritanceclassprac.spec.Female;


public class InheritanceClassPrac {

    
    public static void main(String[] args) {
   
       
        Female f=new Female(36, "selo", "yellow", 5849," 125/5", 14587);
        Child c=new Child("blue");
     
       
        c.setCell(2587486);
//        c.setColor("black");
//        f.setDressName("saree");
//        f.setPrice(5000);
        
        
        
        
        
        System.out.println("cell :"+c.getCell());
        System.out.println("color :"+c.getColor());
        System.out.println("dress :"+f.getDressName());
        System.out.println("price :"+f.getBrand());
        System.out.println("price :"+f.getPrice());
        System.out.println("price :"+f.getCell());
        
            
    
    
    
    }
    
    
    
    
}
