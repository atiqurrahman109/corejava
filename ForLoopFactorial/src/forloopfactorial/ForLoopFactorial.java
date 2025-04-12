package forloopfactorial;

import java.util.Scanner;

public class ForLoopFactorial {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();

        int i = 1;
        int factorial = 1;

        for (i = 1; i <= input; i++) {
            factorial *= i;
            

        }

        System.out.println(factorial+" factorial");

    }

}
