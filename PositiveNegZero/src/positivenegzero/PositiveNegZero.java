
package positivenegzero;

import java.util.Scanner;


public class PositiveNegZero {

    
    public static void main(String[] args) {
        Scanner p=new  Scanner(System.in);
        System.out.println("input number");
        float input=p.nextFloat();
        if(input<0){
            System.out.println("negative");
            }
            else {
             System.out.println("positive");
         }   
        
    }
    
}
