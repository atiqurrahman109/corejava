package primeexam;

import java.util.Scanner;

public class PrimeExam {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("test prime number");
        int input = s.nextInt();

        int count = 0;

        for (int i = 1; i <=input; i++) {
            if (input % i == 0) {
                count++;
            }

        }

        if (count == 2) {

            System.out.println("prime number");
        } 
        else {

            System.out.println("not prime");
        }

    }

}
