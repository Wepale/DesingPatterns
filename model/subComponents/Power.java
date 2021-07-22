package model.subComponents;

public abstract class Power {

    private Integer numberOfConnectors;
    private Integer powerConsumition;

    public Power(Integer numberOfConnectors, Integer powerConsumition) {
            this.numberOfConnectors = numberOfConnectors;
            this.powerConsumition = powerConsumition;
    }

    public Integer getNumberOfConnectors() {
        return numberOfConnectors;
    }

    public Integer getPowerConsumition() {
        return powerConsumition;
    }
}
