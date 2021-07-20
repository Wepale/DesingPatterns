package creationalDesingPatterns.builderPattern.model.components;

public class Memory {

    public static final String TYPE_HYNYX = "HYNYX";
    public static final String TYPE_SAMSUNG = "SAMSUNG";
    public static final Integer SIZE_8GB = 8;
    public static final Integer SIZE_12GB = 12;
    public static final Integer SIZE_16GB = 16;
    
    private Integer memorySize;
    private String memoryType;

    public Memory(Integer memorySize, String memoryType) {
        this.memorySize = memorySize;
        this.memoryType = memoryType;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public String getMemoryType() {
        return memoryType;
    }
}
