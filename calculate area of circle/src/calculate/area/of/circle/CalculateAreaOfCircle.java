
package calculate.area.of.circle;

import java.util.Scanner;


public class CalculateAreaOfCircle {

   
    public static void main(String[] args) {
      
        Scanner c=new Scanner(System.in);
        System.out.println("enter radious");
        float input=c.nextFloat();
        
        if(radious>=0){
            System.out.println("enter positive value");
             input=c.nextFloat();
             float result=Math.PI* Math.pow(radious, 2);       
            System.out.println(""+result);     
        }
        else{
            float result2 =Math.PI*Math.pow(radious, 2);
            System.out.println(""+result2);
        
        }

    }
    
}
