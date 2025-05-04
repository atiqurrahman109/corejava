
package homeofcars.ho;

public class vehicle {
    
    public String brand;
    public int speed;

    public vehicle() {
    }

    public vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    
    public String getVehicleDetails(){
        System.out.println("Brand: " + brand + "\n Speed: " + speed);
        String details = null;
    return details;
    }
    
    
}
