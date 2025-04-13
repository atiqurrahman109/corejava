
package singlarraywork;

import java.lang.reflect.Array;
import java.util.Arrays;


public class SinglArrayWork {

 
    public static void main(String[] args) {
        String names[]=new String[5];
        String ages[]=new String[5];
        
        names[0]="kutub";
        names[1]="raise";
        names[2]="warfare";
        names[3]="raise";
        names[4]="kasem";

        ages[0]="25";
        ages[1]="26";
        ages[2]="27";
        ages[3]="28";
        ages[4]="29";
        
//        for(int i=0; i<5; i++){
//            System.out.println(i+1 + "." + names[i] + " is " + ages[i] + " years old.");
//        }
        
        for(int i=0;i<5;i++){
            System.out.println(i+ " , " +names[i]+ " is " + ages[i] +" old ");
        }
 
         
        
        
        
        
                
    }
    
}
