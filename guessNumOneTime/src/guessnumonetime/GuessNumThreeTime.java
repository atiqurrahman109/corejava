package guessnumonetime;

import java.util.Scanner;

public class GuessNumThreeTime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("guess a number 1st");

        int userinput = s.nextInt();

        int random = (int) (Math.random() * 5);

        int count = 0;

        while (count < 2) {
            if (userinput == random) {
                System.out.println("you win");
                break;
            } else if (userinput > random) {
                System.out.println("you input higher value");
                userinput = s.nextInt();
            } else if (userinput < random) {
                System.out.println("you input lower value ");
                userinput = s.nextInt();
            }

            if (count == 1) {
                System.out.println("good bye");

            }
                count++;
           
        }

    }

}
