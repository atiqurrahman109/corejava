
package mappractice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class MapPractice {

    
    public static void main(String[] args) {
      
        
//        Map<Integer,String> map=new LinkedHashMap<>();
//        map.put(1712515900, "reja");
//        map.put(1596325874, "rakib");
//        map.put(1859642595, "rahim");
//       
//        
//        System.out.println(""+map);
//       
//         map.put(196854835, "parvez");
//         
//         System.out.println(""+map);
    
    
//    double d=4.5;
//    int i=(int) d;
//    
//        System.out.println(""+i);
//        
//        int sum=0;
//            sum+=4.5;
//            sum=(int) (sum+4.5);
//            
//            
//            System.out.println(""+sum);


        Scanner s= new Scanner(System.in);
        
        System.out.println("enter your sales amount");
        float purchaseamount=s.nextFloat();
        
        float tax=(float) (purchaseamount*.05);
        
        System.out.println("pay the tax"+tax);
        
        


    
    }
    
     
   
    
}
