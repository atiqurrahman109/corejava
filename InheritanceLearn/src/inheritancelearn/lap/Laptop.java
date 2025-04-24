
package inheritancelearn.lap;

import inheritancelearn.Computer;


public class Laptop extends Computer{
    
    
    
        public String name;
    public String feature;
    
   
    public String price ;
    public String ram;
    public String display;

    public Laptop() {
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

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    @Override
    public String toString() {
        return "Laptop{" + "name=" + name + ", feature=" + feature + ", price=" + price + ", ram=" + ram + ", display=" + display + '}';
    }
  
    
    
    
    
    
    
    
}
