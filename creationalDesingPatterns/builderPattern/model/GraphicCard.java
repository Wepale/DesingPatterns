package creationalDesingPatterns.builderPattern.model;

import creationalDesingPatterns.builderPattern.model.components.Cooler;
import creationalDesingPatterns.builderPattern.model.components.Memory;
import creationalDesingPatterns.builderPattern.model.components.Power;

public class GraphicCard {

    public static final String BRAND_NVIDIA = "NVIDIA";
    public static final String BRAND_AMD = "AMD";
    
    private String brand;
    private String model;
    private Memory memory;
    private Cooler cooler;
    private Power power;

    public GraphicCard() {}

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setMemory(Memory memory){
        this.memory = memory;
    }

    public void setCooler(Cooler cooler) {
        this.cooler = cooler;
    }

    public void setPower(Power power){
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Memory getMemory() {
        return memory;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public Power getPower() {
        return power;
    }

    @Override
    public String toString(){
        return getClass().getName() 
               + '@' + Integer.toHexString(hashCode()) 
               + String.format("\nModel: %s\nBrand: %s", model, brand);
    }
}
