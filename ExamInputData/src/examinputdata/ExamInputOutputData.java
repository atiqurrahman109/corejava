
package examinputdata;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ExamInputOutputData {

   
    public static void main(String[] args) {
     
        
        File f= new  File("C:\\Users\\Admin\\Desktop\\exam.txt");
        
        try {
            PrintWriter pw=new PrintWriter(f);
            
            pw.print("exam near the door \n be prepaired for the exam \n");
            pw.print("how can i pass the exam");
            
            pw.close();
            
            } 
            
             catch (FileNotFoundException ex) {
            Logger.getLogger(ExamInputOutputData.class.getName()).log(Level.SEVERE, null, ex);
        }
        
          
        
          
//        File o= new  File("C:\\Users\\Admin\\Desktop\\exam.txt");
        
//        try {
//            Scanner s=new Scanner(o);
//            while(s.hasNext()){
//            
//                System.out.println(s.nextLine());
//            }
//        } 
//        
//        catch (FileNotFoundException ex) {
//            Logger.getLogger(ExamInputOutputData.class.getName()).log(Level.SEVERE, null, ex);
//        }
       
        
        

    } 
}
