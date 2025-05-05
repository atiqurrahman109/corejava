
package inheretancevehicle;

import inheretancevehicle.truck.Truck;


public class InheretanceVehicle {

   
    public static void main(String[] args) {
        Truck t = new Truck();
        t.setRegularPrice(100);
        t.setWeight(3000);
        System.out.println(t.getPrice());
    }
    
}
