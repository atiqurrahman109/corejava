 
package learnclassobject;

import learnclassobject.lclass.Circle;

public class LearnClassObject {

 
    public static void main(String[] args) {
   
        
         Circle c=new Circle(3);
        
          System.out.println(c.getArea());
          System.out.println(c.getPerimeter());
        
        c.setRadius(5);
        
         System.out.println(c.getArea());
          System.out.println(c.getPerimeter());
        
        
        
    }
    
}
