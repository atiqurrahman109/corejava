
package mappractice;

import java.util.LinkedHashMap;
import java.util.Map;


public class MapPractice {

    
    public static void main(String[] args) {
      
        
        Map<Integer,String> map=new LinkedHashMap<>();
        map.put(1712515900, "reja");
        map.put(1596325874, "rakib");
        map.put(1859642595, "rahim");
       
        
        System.out.println(""+map);
       
         map.put(196854835, "parvez");
         
         System.out.println(""+map);
    }
    
}
