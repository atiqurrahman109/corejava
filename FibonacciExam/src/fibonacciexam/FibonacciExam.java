
package fibonacciexam;

import java.util.Scanner;


public class FibonacciExam {

   
    public static void main(String[] args) {
 
        Scanner s=new Scanner(System.in);
        System.out.println("enter your fibonacci number");
        int input=s.nextInt();
        
        int num1 = 1;
        int num2 = 2;
        
         System.out.print("Your fibonacci number is: ");
     
         System.out.print(""+num1+" ,"+num2+" ,");
        
        
        for(int i=3;i<=input;i++){
        
            int num3=num1+num2;
        System.out.print(num3 + ", ");
           
            num1 = num2;
            num2 = num3;
        
        }
        
    }
    
}
