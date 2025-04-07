
package rectangle;

import java.util.Scanner;


public class Rectangle {

 
    public static void main(String[] args) {
        Scanner r=new Scanner(System.in);
        System.out.println("input length");
        double input=r.nextDouble();
        System.out.println("input width");
        double input2=r.nextDouble();
        double result=length*width;
        System.out.println("rectangula size is"+result);
    }
    
}
