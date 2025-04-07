
package game;

import java.util.Scanner;


public class Game {

   
    public static void main(String[] args) {
        Scanner g =new Scanner(System.in);
        System.out.println("guess number");
        
        int n1 = g.nextInt();
        int n2 = (int) (Math.random()*9);
       
        
        if(n1 == n2){
            System.out.println("win");
        }
        else{
            System.out.println("you loss");}
       
    }
    
}
