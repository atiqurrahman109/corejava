package singarraywork2;

import java.util.Scanner;

public class SingArrayWork2 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        System.out.println("pls enter the name");
        String[] userName={"raja","topu","kanai","jamal","kamal"};
        String userName1=s.next();
        
        System.out.println("enter your password");
        String[] password={"25","30","55","56","40"};
         String pass=s.next();
         
         userName[i]=userName1;
         password[i]=pass;
         
         
         if(userName==password){
             System.out.println("welcome");
         }
         
         else{
             System.out.println("worng paas");
         }
        
//        System.out.println("enter limit");
//        int n = s.nextInt();
//
//        String[] names = new String[n];
//        int[] marks = new int[n];
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println("Enter name");
//            String name = s.next();
//
//            System.out.println("Enter mark");
//            int mark = s.nextInt();
//
//            names[i] = name;
//            marks[i] = mark;
//        }
//
//        for (int i = 0; i < names.length; i++) {
//            System.out.println(names[i] + " got " + marks[i]);
//        }

    }
}
