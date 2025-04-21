
package fibonnai;

import java.util.Scanner;


public class Fibonnai {

    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        
         System.out.print("Enter your number ");
        double input = s.nextInt();
        
        double number1 = 0;
        double number2 = 1;
        
        System.out.print("Your fibonacci number is: ");
        
        for(double i = 1; i<=input; i++){
            double number3 = number1 + number2;
            System.out.print(number3 + ", ");
           
            number1 = number2;
            number2 = number3;
        
    }
    
}
}