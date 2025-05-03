
package examinputdata;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExamInputData {

   
    public static void main(String[] args) {
     
        
        File f= new  File("C:\\Users\\Admin\\Desktop\\exam.txt");
        
        try {
            PrintWriter pw=new PrintWriter(f);
            
            pw.print("exam near the door \n iruo4 39ir u9idow e8ur9 \n we3 iur4 3yreud euy ");
            pw.print("how can i pass the exam");
            
            pw.close();
            
            } 
            
             catch (FileNotFoundException ex) {
            Logger.getLogger(ExamInputData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
        
          
        File o= new  File("C:\\Users\\Admin\\Desktop\\exam.txt");
        
        try {
            Scanner s=new Scanner(o);
            while(s.hasNext()){
            
                System.out.println(s.nextLine());
            }
        } 
        
        catch (FileNotFoundException ex) {
            Logger.getLogger(ExamInputData.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
        

    } 
}
