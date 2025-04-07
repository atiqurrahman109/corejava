package checkvowelconsonant;

import java.util.Scanner;

public class CheckVowelConsonant {

    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        System.out.println("enter alphabate");
        String input = v.next();

        if (input.equalsIgnoreCase("a") || input.equalsIgnoreCase("e") || input.equalsIgnoreCase("i")
                || input.equalsIgnoreCase("o") || input.equalsIgnoreCase("u")) {
            System.out.println("vowel");

        } else {
            System.out.println("consonent");
        }

    }

}
