package learnmethod;

import java.util.Scanner;

public class LearnMethod {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();

        String result = primeNumber(input);
        String result1 =OddEven(input);
      
        System.out.println(result1);
    }

    public static String primeNumber(int input) {

        String result = " ";
        int count = 0;

        for (int i = 1; i <= input; i++) {
            if (input % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            result = ("it is prime number" + input);
        } else {
            result = ("it is not prime number" + input);
        }

        return result;
      
    }

     public static String OddEven(int input){
     
          String result1 = " ";
         
          if(input %2 == 0){
            result1=("even");
        }
        else{
            result1=("odd");
        }
     
        return result1;
     }
    
    
}
