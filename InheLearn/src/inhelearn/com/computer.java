
package inhelearn.com;

import inhelearn.com.laptop.laptop;


public class computer {
    
    
    private String brand;
    private String generation;
    private int ram;
    private int storage;
    private String monitor;
    private String cpu;

    public computer() {
    }

    public computer(String brand, String generation, int ram, int storage, String monitor, String cpu) {
        this.brand = brand;
        this.generation = generation;
        this.ram = ram;
        this.storage = storage;
        this.monitor = monitor;
        this.cpu = cpu;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getGeneration() {
        return generation;
    }

    public void setGeneration(String generation) {
        this.generation = generation;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getMonitor() {
        return monitor;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "computer{" + "brand=" + brand + ", generation=" + generation + ", ram=" + ram + ", storage=" + storage + ", monitor=" + monitor + ", cpu=" + cpu + '}';
    }
    
    
    
}
