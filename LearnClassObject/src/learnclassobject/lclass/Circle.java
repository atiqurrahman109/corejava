
package learnclassobject.lclass;

import java.security.PublicKey;


public class Circle {
    
    double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea(){
    
        double area=Math.PI * Math.pow(radius, 2);
        return area;
        
         }
        
        public double  getPerimeter(){
        
        double perimeter= 2 * Math.PI * radius;
        
        return perimeter;
        }
        
         public void setRadius(double Radious){
         
           this .radius= Radious;
         
         }
        
   
    
}
