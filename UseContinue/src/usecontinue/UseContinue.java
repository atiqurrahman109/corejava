
package usecontinue;

import java.util.Scanner;


public class UseContinue {

 
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
        int targetValue=100;
                int counter=1;
                
                while(targetValue>=counter){
                    
                    if(counter % 2 == 0 && counter % 4 == 0){
                        counter++;
                        continue;
                    }
                    System.out.println(counter+" Numbers ");
                    counter++;
                }
                
                
    }
    
}
