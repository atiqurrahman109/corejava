
package greatesttwonumbers;

import java.util.Scanner;


public class GreatestTwoNumbers {

   
    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your 1st number");
        
        int num1=s.nextInt();
        System.out.println("Enter your 2nd Number");
        int num2=s.nextInt();
        
        if(num1>num2){
        
            System.out.println("greater number"+num1);
            
        }
        
        else{
            
            System.out.println("greater number"+num2);
        
        }
        if(num1<num2){
        
            System.out.println("smaller number"+num1);
            
        }
        
        else{
            
            System.out.println("smaller number"+num2);
        
        }
        
        
        
    }
    
}
