package creationalDesingPatterns.builderPattern.model.graphicCard.graphicsCards.nvidia;

import creationalDesingPatterns.builderPattern.model.graphicCard.components.Cooler;
import creationalDesingPatterns.builderPattern.model.graphicCard.components.Memory;
import creationalDesingPatterns.builderPattern.model.graphicCard.components.Power;
import creationalDesingPatterns.builderPattern.model.graphicCard.graphicsCards.GraphicCard;
import creationalDesingPatterns.builderPattern.model.graphicCard.interfaces.IGraphicCard;

public class RTX3080 implements IGraphicCard {

    private final String BRAND = GraphicCard.BRAND_NVIDIA;
    private final String MODEL = Class.class.getSimpleName();
    private final Integer MEMORY_SIZE = Memory.SIZE_8GB;
    private final String MEMORY_TYPE = Memory.TYPE_SAMSUNG;
    private final Integer NUMBER_OF_PCI = Power.TWO_PCI;
    private final Integer POWER_CONSUMITION = 275;
    private final Boolean WATERCOLLED = false;
    private final Integer NUMBER_OF_FANS = Cooler.TWO_FAN;

    public GraphicCard getResult() {

        Memory memory = new Memory(MEMORY_SIZE, MEMORY_TYPE);
        Power power = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        Cooler cooler = new Cooler(NUMBER_OF_FANS, WATERCOLLED);

        return new GraphicCard(BRAND, MODEL, memory, cooler, power);
    }
    
}
