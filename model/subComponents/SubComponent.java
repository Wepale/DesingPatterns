package model.subComponents;

public abstract class SubComponent {
    private final String model;
    private final String brand;

    public SubComponent(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }
}
