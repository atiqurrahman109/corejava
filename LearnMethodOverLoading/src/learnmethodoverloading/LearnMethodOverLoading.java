
package learnmethodoverloading;

import java.util.Arrays;
import java.util.Scanner;

public class LearnMethodOverLoading {

   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("input how much you want value");
        int input1=s.nextInt();
        
        int[] myArray=new int[input1];
        
        for(int i=0; i<input1; i++){
            System.out.println("enter value");
            int input2=s.nextInt();
            
            myArray[i]= input2;
            }
            
        sum(myArray);
        
        }
       
         public static void sum(int...a){ 
              
                   int sum=0;
        
                    for(int item:a){
                    sum+=item;
                                 }
        
//                  System.out.println(Arrays.toString(a));
                  System.out.println(" total"+"="+sum);
        
              }
    
            }
                
    
    
   
