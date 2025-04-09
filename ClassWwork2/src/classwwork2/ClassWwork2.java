
package classwwork2;

import java.util.Scanner;


public class ClassWwork2 {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.println("enter year");
        int year=s.nextInt();
        
         System.out.println("enter month");
        String month=s.next();
        
         System.out.println("enter date");
        int date=s.nextInt();
        
        System.out.println("output:"+month +" "+ date+" , "+ year);
        
    }
    
}
