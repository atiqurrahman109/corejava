
package usecontinue;

import java.util.Scanner;


public class UseContinue {

 
    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
        int targetValue=100;
                int count=1;
                
                while(targetValue>=count){
                    
                    if(count % 2 == 0 && count % 4 == 0){
                        count++;
                        continue;
                    }
                    System.out.println(count+" Numbers ");
                    count++;
                }
                
                
    }
    
}
