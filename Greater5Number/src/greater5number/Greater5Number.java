package greater5number;

import java.util.Arrays;
import java.util.Scanner;

public class Greater5Number {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter Array Size ");
        int input = s.nextInt();

        int myArray[] = new int[input];
        int maxNumber=0;
        int minNumber=999999999;

        for (int index = 0; index < input; index++) {

            System.out.println("Enter " + (index + 1));
            int userInput = s.nextInt();
            myArray[index] = userInput;
        }
        System.out.println(Arrays.toString(myArray));
        System.out.println("-------------------");
        
        
        for(int number : myArray){
        
            if(number>maxNumber){
            maxNumber=number;
            }
        }
        for(int number : myArray){
        
            if(number<minNumber){
            minNumber=number;
            }
        }
        System.out.println("Max Number Is "+maxNumber);
        System.out.println("Min Number Is "+minNumber);

    }

}
