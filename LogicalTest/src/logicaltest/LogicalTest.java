package logicaltest;

import java.util.Arrays;
import java.util.Scanner;

public class LogicalTest {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("enter limit");
        int size = s.nextInt();

        int[] numbers = new int[size];

        for (int index = 0; index < size; index++) {

            System.out.println("enter number" + (index + 1));
            int userInput = s.nextInt();
            numbers[index] = userInput;

            System.out.println("print" + Arrays.toString(numbers));

        }

        int maxNumber = numbers[0];
        int minNumber = numbers[0];

        for (int number : numbers) {

            if (number > maxNumber) {

                maxNumber = number;
            }

            if (number < minNumber) {

                minNumber = number;

            }

        }

        System.out.println("Max Number is " + maxNumber);
        System.out.println("Min Number is " + minNumber);
    }

}
