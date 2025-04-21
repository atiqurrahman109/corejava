
package fibonnai;

import java.util.Scanner;


public class Fibonnai {

    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        
         System.out.print("Enter your number ");
        int input = s.nextInt();
        
        int number1 = 0;
        int number2 = 1;
        
        System.out.print("Your fibonacci number is: ");
     
        System.out.print(""+number1+" ,"+number2+" ,");
        
        for(int i = 3; i<=input; i++){
            int number3 = number1 + number2;
            System.out.print(number3 + ", ");
           
            number1 = number2;
            number2 = number3;
        
    }
    
}
}