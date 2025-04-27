package learnfileclass;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LearnFileClass {

    public static void main(String[] args) {

        File f = new File("C:\\Users\\Admin\\Desktop\\prac.text");

        try {
            PrintWriter pw = new PrintWriter(f);
            pw.print("hello world");
            pw.print("java");
            pw.print("h ello java");

            pw.close();

        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClass.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
