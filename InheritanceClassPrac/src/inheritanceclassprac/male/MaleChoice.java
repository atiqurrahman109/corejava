
package inheritanceclassprac.male;


public class MaleChoice {
    
    public String dressName;
    public String brand;
    public int price;
    public String location;
    public int cell;
    

    public MaleChoice() {
    }

    public MaleChoice(String dressName, String brand, int price, String location, int cell) {
        this.dressName = dressName;
        this.brand = brand;
        this.price = price;
        this.location = location;
        this.cell = cell;
    }

    public String getDressName() {
        return dressName;
    }

    public void setDressName(String dressName) {
        this.dressName = dressName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }

    @Override
    public String toString() {
        return "MaleChoice{" + "dressName=" + dressName + ", brand=" + brand + ", price=" + price + ", location=" + location + ", cell=" + cell + '}';
    }

    
    
    
}

