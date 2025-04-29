
package learnfileforloop;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

public class ExamFileForLoop {

    
    public static void main(String[] args) {
       
        try {
            PrintWriter pw = new PrintWriter("C:\\Users\\Admin\\Desktop\\Even.txt");

            for (int i = 1; i <= 50; i++) {

                if (i % 2 == 0) {

               
                    pw.println( i);
                }

            }
            System.out.println("success");
            pw.close();

        } catch (FileNotFoundException ex) {
   
        }
        
        
    }
    
}
