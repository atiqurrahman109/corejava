
package inhevehicle2.vehi;


public class Vehicle {
    
    public int speeed;
    public double regularPrice;
    public String color;

    public Vehicle() {
    }

    public Vehicle(int speeed, double regularPrice, String color) {
        this.speeed = speeed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeeed() {
        return speeed;
    }

    public void setSpeeed(int speeed) {
        this.speeed = speeed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public void setRegularPrice(double regularPrice) {
        this.regularPrice = regularPrice;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
    public double getSalePrice(){
    
        return regularPrice;
    }
    
    
    
    
}
