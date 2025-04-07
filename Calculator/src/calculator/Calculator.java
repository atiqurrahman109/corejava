package calculator;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("inter 1st value");
        double input1 = s.nextDouble();

        System.out.println("inter 2nd value");
        double input2 = s.nextDouble();

        System.out.println("enter your choice like as + - / *");
        String choice = s.next();

        double result = 0;

        switch (choice) {

            case "+":
                result = input1 + input2;
                break;
            case "-":
                result = input1 - input2;
                break;
            case "/":
                result = input1 / input2;
                break;
            case "*":
                result = input1 * input2;
                break;

            default:
                System.out.println("invalid choice");

        }
        System.out.println("result is equal=" +result);

    }

}
