
package learnfileclasspract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnFileClassPract {

   
    public static void main(String[] args) throws FileNotFoundException {
     
      // File f=new File("C:\\Users\\Admin\\Desktop\\atik\\Atik.txt");
      
      
       File f=new File("C:\\Users\\Admin\\Desktop\\apple\\apple.txt");
       
       PrintWriter printWriter=new PrintWriter("C:\\Users\\Admin\\Desktop\\apple\\android.txt");
       
       
       
        try {
            PrintWriter p = new PrintWriter(f);
            
            p.print("Assalamualikum Atik vai");
            p.print("Assalamualikum");
            
            p.close();
            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClassPract.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
    }
    
}
