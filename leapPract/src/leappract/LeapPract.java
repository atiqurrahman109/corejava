
package leappract;

import java.util.Scanner;


public class LeapPract {

 
    public static void main(String[] args) {
   
//        Scanner s=new Scanner(System.in);
//        System.out.println("enter year");
//        int input=s.nextInt();
//        
//        if(input%4==0 && input%100!=0  || input%400==0){
//        
//            System.out.println("this is leap year");
//        }
//        else{
//            System.out.println("not leapyear");
//        }
        
//                  factorial////
        Scanner s=new Scanner(System.in);
        System.out.println("enter your factorial number");
        int input=s.nextInt();
        
        int factorail=1;
        
        for(int i=1; i<=input ; input++){
        
            factorail*=1;
            
        }
        System.out.println("factorial");
    }
    
}

Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();

//        int i = 1;
        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;
            

        }

        System.out.println(factorial+" factorial");