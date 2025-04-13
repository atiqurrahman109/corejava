
package processingarray;

import java.util.Scanner;


public class ProcessingArray {

  
    public static void main(String[] args) {
     
        Scanner s=new Scanner(System.in);
        System.out.println("enter value");
        int n=s.nextInt();
        
        int myArray[]=new int[n];
        
        
        for(int i=0;i<n;i++){
            System.out.println(" second value");
            int input=s.nextInt();
            
            myArray[i]=input;
           
            System.out.println("print result"+input);
        
        }
    }
    
}
