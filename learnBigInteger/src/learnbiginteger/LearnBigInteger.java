package learnbiginteger;

import java.math.BigInteger;
import java.util.Scanner;

public class LearnBigInteger {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter value");
        int input = s.nextInt();

        BigInteger factoria = BigInteger.ONE;

        for (int i = 1; i <= input; i++) {

            factoria = factoria.multiply(BigInteger.valueOf(i));
        }

        System.out.println(factoria);

    }

}
