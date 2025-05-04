
package homeofcars.ho;


public class Car extends vehicle{
    
    public int numberOfDoors;

    public Car() {
    }

    public Car(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Car(int numberOfDoors, String brand, int speed) {
        super(brand, speed);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Number of doors: " + numberOfDoors);
        String details = null;
   return details;
    
    }

    
    
    
    
}
