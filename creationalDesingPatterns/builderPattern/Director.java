package creationalDesingPatterns.builderPattern;

import creationalDesingPatterns.builderPattern.interfaces.iBuilder;
import creationalDesingPatterns.builderPattern.model.GraphicCard;
import creationalDesingPatterns.builderPattern.model.components.Cooler;
import creationalDesingPatterns.builderPattern.model.components.Memory;
import creationalDesingPatterns.builderPattern.model.components.Power;

public class Director {
    private iBuilder builder;

    public Director(iBuilder builder){
        this.builder = builder;
    }

    public void builRX6800(){
        builder.reset();
        builder.setBrand(GraphicCard.BRAND_AMD);
        builder.setModel("RX6800");
        builder.setMemory(new Memory(Memory.SIZE_8GB, Memory.TYPE_HYNYX));
        builder.setPower(new Power(Power.TWO_PCI, 250));
        builder.setCooler(new Cooler(Cooler.THREE_FAN, false));
    }

    public void builRX6900(){
        builder.reset();
        builder.setBrand(GraphicCard.BRAND_AMD);
        builder.setModel("RX6090");
        builder.setMemory(new Memory(Memory.SIZE_16GB, Memory.TYPE_HYNYX));
        builder.setPower(new Power(Power.THREE_PCI, 300));
        builder.setCooler(new Cooler(Cooler.THREE_FAN, false));
    }

    public void builRTX3080(){
        builder.reset();
        builder.setBrand(GraphicCard.BRAND_NVIDIA);
        builder.setModel("RTX3080");
        builder.setMemory(new Memory(Memory.SIZE_8GB, Memory.TYPE_SAMSUNG));
        builder.setPower(new Power(Power.TWO_PCI, 275));
        builder.setCooler(new Cooler(Cooler.TWO_FAN, false));
    }

    public void builRTX3090(){
        builder.reset();
        builder.setBrand(GraphicCard.BRAND_AMD);
        builder.setModel("RX6800");
        builder.setMemory(new Memory(Memory.SIZE_16GB, Memory.TYPE_SAMSUNG));
        builder.setPower(new Power(Power.THREE_PCI, 375));
        builder.setCooler(new Cooler(Cooler.ZERO_FAN, true));
    }
}
