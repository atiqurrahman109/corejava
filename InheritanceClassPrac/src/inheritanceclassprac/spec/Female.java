
package inheritanceclassprac.spec;

import inheritanceclassprac.male.MaleChoice;


public class Female extends MaleChoice{
    
    public String dressName;
    
    public int price;
    public String location;
    public int cell;

    public Female(String dressName, int price, String location, int cell) {
        this.dressName = dressName;
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
        return "Female{" + "dressName=" + dressName + ", price=" + price + ", location=" + location + ", cell=" + cell + '}';
    }

    
    
    
    
}
