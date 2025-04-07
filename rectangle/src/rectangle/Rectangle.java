package rectangle;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        
        System.out.println("input length");
        double length = r.nextDouble();
        
        System.out.println("input width");
        double width = r.nextDouble();
        
        double result = length * width;
        
        System.out.println("rectangula size is" + result);
    }

}
