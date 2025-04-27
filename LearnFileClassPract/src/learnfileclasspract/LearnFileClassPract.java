
package learnfileclasspract;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LearnFileClassPract {

   
    public static void main(String[] args) {
     
       File f=new File("C:\\Users\\Admin\\Desktop\\Atik.txt");
       
       
       
        try {
            PrintWriter p = new PrintWriter(f);
            
            p.print("Assalamualikum Atik vai");
            
            p.close();
            
        } 
        catch (FileNotFoundException ex) {
            Logger.getLogger(LearnFileClassPract.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
       
    }
    
}
