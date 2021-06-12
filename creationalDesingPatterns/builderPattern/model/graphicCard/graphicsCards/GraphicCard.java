package creationalDesingPatterns.builderPattern.model.graphicCard.graphicsCards;

import creationalDesingPatterns.builderPattern.model.graphicCard.components.Cooler;
import creationalDesingPatterns.builderPattern.model.graphicCard.components.Memory;
import creationalDesingPatterns.builderPattern.model.graphicCard.components.Power;

public class GraphicCard {

    public static final String BRAND_NVIDIA = "NVIDIA";
    public static final String BRAND_AMD = "AMD";
    
    private String brand;
    private String model;
    private Memory memory;
    private Cooler cooler;
    private Power power;

    public GraphicCard( String brand, 
                        String model, 
                        Memory memory,
                        Cooler cooler,
                        Power power
    ){
        this.brand = brand;
        this.model = model;
        this.memory= memory;
        this.cooler = cooler;
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



}
