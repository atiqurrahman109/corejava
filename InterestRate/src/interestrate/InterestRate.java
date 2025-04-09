
package interestrate;

import java.util.Scanner;


public class InterestRate {

   
    public static void main(String[] args) {
       
        Scanner interest=new Scanner(System.in);
        
        System.out.println("enter interest rate");
        double interestRate=interest.nextDouble();
        
        double monthlyInterestRate=interestRate/1200;
        System.out.println("number of year");
        
        double numberOfYear=interest.nextDouble();
        
        System.out.println("loan amount");
        double loanAmount=interest.nextDouble();
        


        double monthlyPayment= loanAmount*MonthlyInterestRate/
                (1-1/Math.pow(1+MonthlyInterestRate,numberOfYear*12));
        
        double totalPayment=monthlyPayment*totalYear*12;
        
        System.out.println("monthly payment is "+monthlyPayment);
        System.out.println("total payment is"+totalPayment);
        
        
        
        
        
    }
    
}
