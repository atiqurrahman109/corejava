
package multiplicationby2;

import java.util.Scanner;


public class MultiplicationBy2 {

    public static void main(String[] args) {
    
        
        Scanner s=new Scanner(System.in);
            int userinput=s.nextInt();
            
        
        int result=1;
           
            
            for( int i=1; i <=10; i++){
                result=userinput*i;
                 System.out.println(userinput+"x"+i+"="+result);
            }
       
      
    }
    
}
