
package homeofcars;

import homeofcars.ho.Bike;
import homeofcars.ho.Car;
import homeofcars.ho.vehicle;


public class HomeOfCars {

    private static String FeatureOfbike;

   
    public static void main(String[] args) {
        String ford = null;
       
        Car c = new Car(2, "ford", 120);
        String kawasaki = null;
        Bike b=new Bike("kawasaki");
        
        System.out.println(""+c.getVehicleDetails());
        System.out.println(""+b.getVehicleDetails());
        
    }
    
}
