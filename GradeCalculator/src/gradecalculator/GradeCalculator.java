package gradecalculator;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        float input = s.nextInt();
        if (input >= 90 && input <=100) {
            System.out.println("print A");
        } else if (input >= 80 && input <=89) {
            System.out.println("print B");
        } else if (input >= 70&& input <=79) {
            System.out.println("print c");
        } else if (input >= 60&& input <=69) {
            System.out.println("print d");
        } else if (input >=0 && input<=60) {
            System.out.println("print f");
        } else {
            System.out.println("invalid");
        }

    }
}
