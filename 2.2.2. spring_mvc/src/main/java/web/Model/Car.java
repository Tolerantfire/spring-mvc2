package web.Model;

public class Car {
    private int version;
    private String model;
    private String color;

    public Car(int version, String model, String color) {
        this.version = version;
        this.model = model;
        this.color = color;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "version=" + version +
                ", model='" + model + '\'' +
                ", Color='" + color + '\'' +
                '}';
    }
}
