
package price200;

import java.util.Scanner;


public class Price200 {

  
    public static void main(String[] args) {
   
        Scanner s=new Scanner(System.in);
        System.out.println("enter amount");
        float amount=s.nextFloat();
        
        
        
        if(amount>200){
         float discount = (float) (amount* 0.05);
          
            System.out.println("here is your discount is "+discount);
        }
        else{
            System.out.println("none");
        }
        
    }
    
}
