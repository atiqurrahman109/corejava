
package currenttimebook;

import static java.time.Clock.system;


public class CurrentTimeBook {

  
    public static void main(String[] args) {
   
        long totalMilliseconds=System.currentTimeMillis();
        
        long totalSeconds=totalMilliseconds/1000;
        
        long currentSecond=totalSeconds%60;
        
        long totalMinutes=totalSeconds/60;
        
        long currentMinutes=totalMinutes%60;
        
        long totalHour=totalMinutes/60;
        
        long currentHour=totalHour%60;
        
        System.out.println("current time is" + currentHour+":"+currentMinutes+":"+currentSecond+"gmt");
        
        
        
    }
    
   
    
}
