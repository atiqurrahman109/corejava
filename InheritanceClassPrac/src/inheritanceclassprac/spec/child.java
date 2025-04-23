
package inheritanceclassprac.spec;

import inheritanceclassprac.male.MaleChoice;


public class child extends MaleChoice{
    
    public String dressName;
    public int size;
    
    public int price;
    public String location;
    public int cell;

    public child(String dressName, int size, int price, String location, int cell) {
        this.dressName = dressName;
        this.size = size;
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

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
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
        return "child{" + "dressName=" + dressName + ", size=" + size + ", price=" + price + ", location=" + location + ", cell=" + cell + '}';
    }
    
    
    
    
    
}
