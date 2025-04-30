package learnfileclass3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass3 {

    public static void main(String[] args) {

        File f = new File("F:\\reja.txt");

        try {

            PrintWriter p = new PrintWriter(f);

            p.print("beautiful bangladesh");
            p.print("beautiful bangla");
            p.print("beautiful country");

            p.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        File s=new File("F:\\reja.txt");
        
        try {
            Scanner p=new Scanner(s);
        
            while (p.hasNext()) {
                System.out.println(p.nextLine());
                
            }
        } 
        
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass3.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }

}
