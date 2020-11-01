package Model;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Car {
    private int version;
    private String model;
    private String color;

    static Car car1 = new Car(1, "Skoda", "Black");
    static Car car2 = new Car(2, "BMV", "Grey");
    static Car car3 = new Car(3, "Lada", "Blue");
    static Car car4 = new Car(4, "Toyota", "Red");
    static Car car5 = new Car(5, "Renault", "Green");

    static public List<Car> createList (){
        List<Car> list = new ArrayList<>();
        list.add(car1);
        list.add(car2);
        list.add(car3);
        list.add(car4);
        list.add(car5);
        return list;
    };

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
