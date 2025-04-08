package pkgclass.work;

import java.util.Scanner;
import javax.print.DocFlavor;

public class ClassWork {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.println("Enter the word ");
        String input = s.next();

        System.out.println(input.concat(" Programmer"));
    }

}
