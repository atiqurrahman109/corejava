
package calculatemonthlyinterest;

import java.util.Scanner;


public class CalculateMonthlyInterest {


    public static void main(String[] args) {
        Scanner s=new  Scanner(System.in);
                
               System.out.println("enter interest rate like as 12.5%");
               double interestRate=s.nextDouble();
               double  MonthlyInterestRate= interestRate/1200;      
       
               System.out.println("enter number of year");
               int numberOfYear=s.nextInt();
               
               System.out.println("enter loan amount");
               double loanAmount=s.nextDouble();
               
               double monthlyPayment= loanAmount*MonthlyInterestRate/(1-1/Math.pow(1+MonthlyInterestRate,numberOfYear*12));
               
               double totalPayment =monthlyPayment*numberOfYear*12;
               
               System.out.println("the monthly payment is $"+(int)monthlyPayment);
               
              System.out.println("the total payment is $"+(int)totalPayment);
               
                
             }
    }
