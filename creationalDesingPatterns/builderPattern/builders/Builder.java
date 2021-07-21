package creationalDesingPatterns.builderPattern.builders;

import creationalDesingPatterns.builderPattern.model.components.Cooler;
import creationalDesingPatterns.builderPattern.model.components.Memory;
import creationalDesingPatterns.builderPattern.model.components.Power;

public interface Builder {
    public void reset();
    public void setBrand(String brand);
    public void setModel(String model);
    public void setMemory(Memory memory);
    public void setCooler(Cooler cooler);
    public void setPower(Power power);
}
