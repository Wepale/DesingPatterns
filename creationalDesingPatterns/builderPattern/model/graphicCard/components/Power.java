package creationalDesingPatterns.builderPattern.model.graphicCard.components;

public class Power {

    public static final Integer ONE_PCI = 1;
    public static final Integer TWO_PCI = 2;
    public static final Integer THREE_PCI = 3;

    private Integer numberOfPciConnectors;
    private Integer powerConsumition;

    public Power(Integer numberOfPciConnectors, Integer powerConsumition) {
            this.numberOfPciConnectors = numberOfPciConnectors;
            this.powerConsumition = powerConsumition;
    }

    public Integer getNumberOfPciConnectors() {
        return numberOfPciConnectors;
    }

    public Integer getPowerConsumition() {
        return powerConsumition;
    }
}
