package model.subComponents;

public class Memory {

    public static final String HYNYX = "HYNYX";
    public static final String SAMSUNG = "SAMSUNG";
    public static final String DDR4 = "DDR4";
    public static final String GDDR5 = "GDDR5";
    public static final Integer SIZE_8GB = 8;
    public static final Integer SIZE_12GB = 12;
    public static final Integer SIZE_16GB = 16;

    private final Integer memorySize;
    private final String manufacturer;
    private final String type;

    public Memory(Integer memorySize, String manufacturer, String type) {
        this.memorySize = memorySize;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setMemory() {
        
    }

    public String getType() {
        return type;
    }
}
