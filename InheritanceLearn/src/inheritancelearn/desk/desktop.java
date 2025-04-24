
package inheritancelearn.desk;

import inheritancelearn.Computer;


public class desktop extends Computer{
    
    
    
      public String name;
    public String feature;
    
   
    public String price ;
    public String ram;
    public String speed;

    public desktop() {
    }

    public desktop(String name, String feature, String price, String ram, String speed) {
        this.name = name;
        this.feature = feature;
        this.price = price;
        this.ram = ram;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFeature() {
        return feature;
    }

    public void setFeature(String feature) {
        this.feature = feature;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "desktop{" + "name=" + name + ", feature=" + feature + ", price=" + price + ", ram=" + ram + ", speed=" + speed + '}';
    }
    
    
    
    
    
}
