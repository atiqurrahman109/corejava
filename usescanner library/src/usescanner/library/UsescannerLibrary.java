
package usescanner.library;

import java.util.Scanner;


public class UsescannerLibrary {

   
    public static void main(String[] args) {
        
      Scanner input=new Scanner (System.in);
       
        System.out.println("enter 1st number");
        int number1 =input.nextInt();
        System.out.println("enter 2nd number");
        int number2=input.nextInt();
        
        float result=(float) number1/number2;
        
        System.out.println("result is"+result);

        
//        edit part
Scanner input=new Scanner (System.in);
        
        System.out.println("enter 1st number");
        float number1 =input.nextFloat();
        System.out.println("enter 2nd number");
        float number2=input.nextFloat();
        
        float result= number1/number2;
        
        System.out.println("result is "+result);



      
    }
    
}



    

