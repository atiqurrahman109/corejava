
package evenorodd;

import java.util.Arrays;
import java.util.Scanner;


public class EvenOrOdd {

  
    public static void main(String[] args) {
        
        // even odd test //// 1 
        Scanner e=new Scanner(System.in);
        System.out.println("input number");
        float input=e.nextFloat();
       
        
        if(input %2 == 0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
        //bubble short// 2
        
        Scanner scan=new Scanner(System.in);

        System.out.print("Enter your array size: ");
        int arraySize = scan.nextInt();

        int[] myArray = new int[arraySize];

        for (int index = 0; index < myArray.length; index++) {
            System.out.print("Enter array value: ");
            int userValue = scan.nextInt();
            myArray[index] = userValue;
        }

        System.out.println("Array before sorting: " + Arrays.toString(myArray));

        for (int round = 0; round < myArray.length - 1; round++) {
            for (int step = 0; step < myArray.length - 1 - round; step++) {
                if (myArray[step]>myArray[step+1]) {
                    
                    int temp = myArray[step + 1];
                    myArray[step + 1] = myArray[step];
                    myArray[step] = temp;
                }
            }
        }
        System.out.println("Array before sorting: " + Arrays.toString(myArray));
        
        
        //positive negative 3
        
          Scanner p=new  Scanner(System.in);
        System.out.println("input number");
        float input=p.nextFloat();
       
        if(input<0){
            System.out.println("negative");
            }
       
        else if(input==0){
        System.out.println("zero");
        }
       
        else {
             System.out.println("positive");
         }   
        
        //prime number// 4
        
         Scanner s = new Scanner(System.in);

        System.out.println("enter your number");
        int input = s.nextInt();

        int count = 0;

        for (int i = 1; i < input; i++) {

            if (input % i == 0) {
                count++;

            }
        }
        if (count == 2) {
            System.out.println("that's prime number" + input);
        } else {
            System.out.println("that's not prime number" + input);
        }

        //fibonnaci// 5
        
        
        
         Scanner s=new Scanner(System.in);
        
         System.out.print("Enter your number ");
        int input=s.nextInt();
        
        int number1 = 0;
        int number2 = 1;
        
        System.out.print("Your fibonacci number is: ");
     
        System.out.print(""+number1+" ,"+number2+" ,");
        
        for(int i = 3; i<=input; i++){
            int number3 = number1 + number2;
            System.out.print(number3 + ", ");
           
            number1 = number2;
            number2 = number3;
        
    }
        
        
        //factorial//  6
        
         Scanner s = new Scanner(System.in);
        System.out.println("enter number");
        int input = s.nextInt();

//        int i = 1;
        int factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;
            

        }

        System.out.println(factorial+" factorial");
        
        
        // leap year//
        
         public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        System.out.println("input value");
        double input = l.nextDouble();
       
        
        if ((input % 4 == 0) && (input % 100 != 0) || (input % 400 == 0)) {
            System.out.println("leap year");
        } else {
            System.out.println("not leapyear");
        }
        
        
    }
    
}
