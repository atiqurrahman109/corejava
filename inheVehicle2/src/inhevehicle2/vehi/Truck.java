
package inhevehicle2.vehi;

public class Truck extends Vehicle{
    
    
    public  int weight;

    public Truck() {
    }

    public Truck(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        
        if(weight>2000){
        
            return regularPrice-(regularPrice*0.1);
            } 
        else{
        
        return regularPrice;
        
        }
       
        
      
    }

   

   

 

   

  
    
    
    
}
