package primenumber2;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class PrimeNumber2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int input = s.nextInt();

        int count = 0;

        for (int index = 1; index <= input; index++) {
            if (input % index == 0) {

                count++;
            }

        }

        if (count == 2) {
            System.out.println("prime number" + input);

        } else {
            System.out.println("not a prime" + input);
        }
    }

}
