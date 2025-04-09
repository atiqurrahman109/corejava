
package convert.mint;

import java.util.Scanner;

public class ConvertMint {

  
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("input");
                
         float totalseconds=s.nextFloat();
                 
        float hour=totalseconds/3600;
        
        float remainingseconds=totalseconds%3600;
        
         float mint =remainingseconds / 60;
         float currentSecond= mint %60;
          
          System.out.println(totalseconds+"seconds="+hour+" hours="+ mint+"minutes="+currentSecond+ " seconds ");
        
      
    }
    
}
