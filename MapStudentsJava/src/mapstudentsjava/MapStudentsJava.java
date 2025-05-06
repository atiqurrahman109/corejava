
package mapstudentsjava;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;


public class MapStudentsJava {


   
    public static void main(String[] args) {
      
     Map<String,Integer> hashMap=new HashMap<>();
     
     hashMap.put("a", 25);
     hashMap.put("b", 235);
     hashMap.put("ac", 250);
     hashMap.put("ad", 25);
        
                System.out.println("display entires in hashmap");
                
                System.out.println(hashMap +"\n");
                
                new TreeMap<>(hashMap);
                System.out.println("dispaly entires in ascending order of key");
       
                
                
                boolean TreeMap = false;
                System.out.println(TreeMap);
                
                Map<String,Integer> linkedHashMap=
                        new LinkedHashMap<>(16,0.75f,true);
                linkedHashMap.put("a",25);
                linkedHashMap.put("b",235);
                linkedHashMap.put("ac",250);
                linkedHashMap.put("ad",25);
                
                System.out.println("\nThe age for"+"a is"+ linkedHashMap.get( "a"));
                
                System.out.println("display entires in linkedhashMap");
                System.out.println(linkedHashMap);
        
    }
    
}
