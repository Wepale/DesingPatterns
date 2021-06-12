package creationalDesingPatterns.builderPattern.model.graphicCard.components;

public class Cooler {

    public final static Integer ZERO_FAN = 0;   
    public final static Integer ONE_FAN = 1;
    public final static Integer TWO_FAN = 2;
    public final static Integer THREE_FAN = 3;
    
    private Integer numberOfFans;
    private Boolean watterCooled;
    private Boolean customLoop;

    public Cooler(Integer numberOfFans, Boolean watterCooled) {
        this.numberOfFans = numberOfFans;
        this.watterCooled = watterCooled;
        customLoop = watterCooled && numberOfFans == 0;
    }

    public Integer getNumberOfFans() {
        return numberOfFans;
    }

    public Boolean getWatterCooled() {
        return watterCooled;
    }

    public Boolean getCustomLoop() {
        return customLoop;
    }

}
