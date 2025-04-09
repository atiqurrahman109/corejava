
package evenorodd;

import java.util.Scanner;


public class EvenOrOdd {

  
    public static void main(String[] args) {
        Scanner e=new Scanner(System.in);
        System.out.println("input number");
        float input=e.nextFloat();
       
        
        if(input %2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
    
}
