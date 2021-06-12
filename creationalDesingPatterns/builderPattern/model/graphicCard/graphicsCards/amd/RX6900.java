package creationalDesingPatterns.builderPattern.model.graphicCard.graphicsCards.amd;

import creationalDesingPatterns.builderPattern.model.graphicCard.components.Cooler;
import creationalDesingPatterns.builderPattern.model.graphicCard.components.Memory;
import creationalDesingPatterns.builderPattern.model.graphicCard.components.Power;
import creationalDesingPatterns.builderPattern.model.graphicCard.graphicsCards.GraphicCard;
import creationalDesingPatterns.builderPattern.model.graphicCard.interfaces.IGraphicCard;

public class RX6900 implements IGraphicCard {

    private final String BRAND = GraphicCard.BRAND_AMD;
    private final String MODEL = Class.class.getSimpleName();
    private final Integer MEMORY_SIZE = Memory.SIZE_16GB;
    private final String MEMORY_TYPE = Memory.TYPE_HYNYX;
    private final Integer NUMBER_OF_PCI = Power.THREE_PCI;
    private final Integer POWER_CONSUMITION = 300;
    private final Boolean WATERCOLLED = true;
    private final Integer NUMBER_OF_FANS = Cooler.THREE_FAN;

    public GraphicCard getResult() {

        Memory memory = new Memory(MEMORY_SIZE, MEMORY_TYPE);
        Power power = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        Cooler cooler = new Cooler(NUMBER_OF_FANS, WATERCOLLED);

        return new GraphicCard(BRAND, MODEL, memory, cooler, power);
    }
    
}
