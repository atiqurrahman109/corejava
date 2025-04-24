
package inheritanceclassprac.spec;

import inheritanceclassprac.male.MaleChoice;


public class Child extends MaleChoice{
    
    
    public String color;

    public Child() {
    }

    public Child(String color) {
        this.color = color;
    }

    public Child(String color, String dressName, String brand, int price, String location, int cell) {
        super(dressName, brand, price, location, cell);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    
    
    
    
    
}
