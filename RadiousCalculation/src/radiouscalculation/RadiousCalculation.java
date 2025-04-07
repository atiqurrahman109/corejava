package radiouscalculation;

import java.util.Scanner;

public class RadiousCalculation {

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);

        System.out.println("enter radious");
        double radious = r.nextDouble();

        if (radious <= 0) {
            System.out.println("enter positive value");
            radious = r.nextDouble();
            double result = (Math.PI * Math.pow(radious, 2));
            System.out.println("area is " + result);

        } else {
             double result2 = (Math.PI * Math.pow(radious, 2));

            System.out.println("area is " + result2);
        }


    }

}
