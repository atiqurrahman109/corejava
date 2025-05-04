
package homeofcars.ho;


public class Bike extends vehicle{
    
    public String hasCareer;

    public Bike() {
    }

    public Bike(String hasCareer) {
        this.hasCareer = hasCareer;
    }

    public String getHasCareer() {
        return hasCareer;
    }

    public void setHasCareer(String hasCareer) {
        this.hasCareer = hasCareer;
    }

    @Override
    public String getVehicleDetails() {
        super.getVehicleDetails();
        System.out.println("Has Career: " + hasCareer);
        String details = null;
        return details;
    }

    
    
    
    
}
