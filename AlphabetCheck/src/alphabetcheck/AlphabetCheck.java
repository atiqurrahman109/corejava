package alphabetcheck;

import java.util.Scanner;

public class AlphabetCheck {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        String input = a.next();
        switch (input) {

            case "a":
                System.out.println("vowel");
                break;
            case "e":
                System.out.println("vowel");
                break;
            case "i":
                System.out.println("vowel");
                break;
            case "o":
                System.out.println("vowel");
                break;
            case "u":
                System.out.println("vowel");
                break;

            default:
                System.out.println("consunant");

        }

    }

}
