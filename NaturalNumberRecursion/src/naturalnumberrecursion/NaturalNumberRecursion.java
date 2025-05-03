
package naturalnumberrecursion;


public class NaturalNumberRecursion {

   
    public static void main(String[] args) {
        System.out.println(sum(30));
//        System.out.println(fibonacci(8));
    }
    public static int sum(int n){
    if(n<=1){
    
    return n;
    
    }
    else{
    return n+ sum(n-1);
    }
    
    
    }
    
//    public static int fibonacci(int n){
//    
//    if(n<=1){
//    
//        return n;
//    
//    }
//    else{
//    return fibonacci(n-1)+fibonacci(n-2);
//    
//    
//    }
//     }
    
    }
    
   
    

