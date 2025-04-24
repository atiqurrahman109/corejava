
package inhelearn.com.laptop;

import inhelearn.com.computer;


public class laptop extends computer {
    
   private String charger;

    public laptop() {
    }

    public laptop(String charger) {
        this.charger = charger;
    }

    public laptop(String charger, String brand, String generation, int ram, int storage, String monitor, String cpu) {
        super(brand, generation, ram, storage, monitor, cpu);
        this.charger = charger;
    }

    public String getCharger() {
        return charger;
    }

    public void setCharger(String charger) {
        this.charger = charger;
    }
    
    
    
    
    
    
            }
