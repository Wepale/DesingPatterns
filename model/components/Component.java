package model.components;

public abstract class Component {
    private String model;
    private String brand;

    public Component(String model, String brand){
        this.model = model;
        this.brand = brand;
    }

    public void setBrand(String brand) {
        if (this.brand == null) {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (this.model == null){
            this.model = model;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public abstract void start();
}
