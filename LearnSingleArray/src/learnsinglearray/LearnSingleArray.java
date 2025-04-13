
package learnsinglearray;

import java.util.Arrays;


public class LearnSingleArray {

 
    public static void main(String[] args) {
    
        String[] names =new String[5];
            int[]marks=new int[5];
            int[] ages={2,3,4,5,6,7};
            
        System.out.println(Arrays.toString(names));
        
        names[0]="kutub";
        names[1]="raise";
        names[2]="warfare";
        names[3]="raise";
        names[14]="raise";
        
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(ages));
        System.out.println(marks[2]);
        
    }
    
}
