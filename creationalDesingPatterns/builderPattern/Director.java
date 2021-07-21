package creationalDesingPatterns.builderPattern;

import creationalDesingPatterns.builderPattern.interfaces.iBuilder;
import creationalDesingPatterns.builderPattern.model.GraphicCard;
import creationalDesingPatterns.builderPattern.model.components.Cooler;
import creationalDesingPatterns.builderPattern.model.components.Memory;
import creationalDesingPatterns.builderPattern.model.components.Power;

public class Director {
    iBuilder builder;

    public Director(iBuilder builder){
        this.builder = builder;
    }

    private void orquestateBuild(String brand, String model, Memory memory, Power power, Cooler cooler){
        builder.reset();
        builder.setBrand(brand);
        builder.setModel(model);
        builder.setMemory(memory);
        builder.setPower(power);
        builder.setCooler(cooler);
    }

    public void builRX6800(){
        final String BRAND = GraphicCard.BRAND_AMD; 
        final String MODEL = "RX6800";
        final Integer MEMORY_SIZE = Memory.SIZE_8GB;
        final String MEMORY_TYPE = Memory.TYPE_HYNYX;
        final Integer NUMBER_OF_PCI = Power.TWO_PCI;
        final Integer POWER_CONSUMITION = 250;
        final Integer NUMBER_OF_FANS = Cooler.THREE_FAN;
        final Boolean WATERCOLLED = false;

        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOLLED);

        orquestateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }

    public void builRX6900(){
        final String BRAND = GraphicCard.BRAND_AMD;
        final String MODEL = "RX6900";
        final Integer MEMORY_SIZE = Memory.SIZE_16GB;
        final String MEMORY_TYPE = Memory.TYPE_HYNYX;
        final Integer NUMBER_OF_PCI = Power.THREE_PCI;
        final Integer POWER_CONSUMITION = 300;
        final Integer NUMBER_OF_FANS = Cooler.THREE_FAN;
        final Boolean WATERCOLLED = true;

        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOLLED);

        orquestateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }

    public void builRTX3080(){
        final String BRAND = GraphicCard.BRAND_NVIDIA;
        final String MODEL = "RTX3080";
        final Integer MEMORY_SIZE = Memory.SIZE_8GB;
        final String MEMORY_TYPE = Memory.TYPE_SAMSUNG;
        final Integer NUMBER_OF_PCI = Power.TWO_PCI;
        final Integer POWER_CONSUMITION = 275;
        final Integer NUMBER_OF_FANS = Cooler.TWO_FAN;
        final Boolean WATERCOLLED = false;

        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOLLED);

        orquestateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }

    public void builRTX3090(){
        final String BRAND = GraphicCard.BRAND_NVIDIA;
        final String MODEL = "RTX3090";
        final Integer MEMORY_SIZE = Memory.SIZE_16GB;
        final String MEMORY_TYPE = Memory.TYPE_SAMSUNG;
        final Integer NUMBER_OF_PCI = Power.THREE_PCI;
        final Integer POWER_CONSUMITION = 375;
        final Integer NUMBER_OF_FANS = Cooler.ZERO_FAN;
        final Boolean WATERCOLLED = true;


        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOLLED);

        orquestateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }
}
