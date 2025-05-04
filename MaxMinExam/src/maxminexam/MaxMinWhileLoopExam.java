
package maxminexam;

import java.util.Arrays;
import java.util.Scanner;


public class MaxMinWhileLoopExam {

    
    public static void main(String[] args) {
  
        Scanner s=new Scanner(System.in);
        System.out.println("enter limit");
        int input=s.nextInt();
        
        int myArray[]=new int[input];
        
        int maxNum=0;
        int minNum=99999999;
        
        for(int i=0;i<input;i++){
       
            System.out.println("  enter  " +(i+1)); 
            
            int userInput = s.nextInt();
             myArray[i] = userInput;
             
              }
             System.out.println(Arrays.toString(myArray));
             
        for(int number : myArray){
        
            if(number>maxNum){
            maxNum=number;
            }
        }
        
        for(int number:myArray){
        if(number<minNum){
            minNum=number;
        
        }
        
        
        }
            
           System.out.println("  this is large number  "+maxNum);
           System.out.println("  this is small number  "+minNum);
              
       
        
    }
    
}
