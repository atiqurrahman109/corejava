package leapyearchecker;

import java.util.Scanner;

public class LeapYearChecker {

    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        System.out.println("input value");
        double input = l.nextDouble();
       
        
        if ((input % 4 == 0) && (input % 100 != 0) || (input % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leapyear");
        }
    }

}
