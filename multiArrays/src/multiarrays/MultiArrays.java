package multiarrays;

import java.util.Scanner;

public class MultiArrays {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter row number");
        int row = s.nextInt();

        System.out.println("enter col number");
        int col = s.nextInt();

        int[][] myArray = new int[row][col];

        for (row = 0; row < myArray.length; row++) {
            for (col = 0; col < myArray[row].length; col++) {
                System.out.println("Enter " + (col + 1));
                int userInput=s.nextInt();
                myArray[row][col]=userInput;
                 
            }

        }

        for (int rows = 0; rows < myArray.length; rows++) {
            for (int cols = 0; cols < myArray[rows].length; cols++) {
                System.out.print(myArray[rows][cols] + " ");

            }
            System.out.print("\n");
        }
    }
}
