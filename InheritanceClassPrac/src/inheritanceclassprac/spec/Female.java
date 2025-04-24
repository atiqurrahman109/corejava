
package inheritanceclassprac.spec;

import inheritanceclassprac.male.MaleChoice;


public class Female extends MaleChoice{
    
    
    
    public double size;

    public Female(double size) {
        this.size = size;
    }

    public Female(double size, String dressName, String brand, int price, String location, int cell) {
        super(dressName, brand, price, location, cell);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

   

   

  

  

    
    
    
    
}
