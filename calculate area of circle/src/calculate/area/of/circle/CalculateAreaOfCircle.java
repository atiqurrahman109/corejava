package calculate.area.of.circle;

import java.util.Scanner;

public class CalculateAreaOfCircle {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);
        System.out.println("enter radious");
        float input = c.nextFloat();

        if (input <= 0) {
            System.out.println("enter value which greater than zero ");
            input = c.nextFloat();
            float result1 = (float) (Math.PI * Math.pow(input, 2));
            System.out.println("" + result1);
        } else {
            float result2 = (float) (Math.PI * Math.pow(input, 2));
            System.out.println("" + result2);

        }

    }

}
