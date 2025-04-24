
package inhelearn.com.laptop;

import inhelearn.com.computer;


public class desktop extends computer{
    
    private String cooler;

    public desktop() {
    }

    public desktop(String cooler) {
        this.cooler = cooler;
    }

    public String getCooler() {
        return cooler;
    }

    public void setCooler(String cooler) {
        this.cooler = cooler;
    }
    
    
    
}
