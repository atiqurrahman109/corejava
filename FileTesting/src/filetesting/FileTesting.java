
package filetesting;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class FileTesting {

   
    public static void main(String[] args) {
      
        File f=new File("G:\\backup\\atik\\code\\java\\try.txt");
        
        try {
//                    System.out.println(f.canRead());
//        System.out.println(f.exists());
//        System.out.println(f.canWrite());

        PrintWriter pw=new PrintWriter(f);
        
        pw.print("I trying coding");
        pw.print("2X1=2");
        pw.print("I practicing coding");
        pw.print("I love coding");
        
        pw.close();
        
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(FileTesting.class.getName()).log(Level.SEVERE, null, ex);
        }
        


    }
    
}
