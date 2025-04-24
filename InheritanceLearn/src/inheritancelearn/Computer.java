
package inheritancelearn;


public class Computer {
    
    
    public String name;
    public String feature;
    public String size;
   
    public String price ;
    public String ram;
    public String harddisk;

    public Computer() {
    }

    public Computer(String name, String feature, String size, String price, String ram, String harddisk) {
        this.name = name;
        this.feature = feature;
        this.size = size;
        this.price = price;
        this.ram = ram;
        this.harddisk = harddisk;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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

    public String getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(String harddisk) {
        this.harddisk = harddisk;
    }

    @Override
    public String toString() {
        return "Computer{" + "name=" + name + ", feature=" + feature + ", size=" + size + ", price=" + price + ", ram=" + ram + ", harddisk=" + harddisk + '}';
    }
    
    
    
    
    
    
    
}
