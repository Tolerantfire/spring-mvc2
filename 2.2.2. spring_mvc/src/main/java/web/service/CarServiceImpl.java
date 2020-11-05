package web.service;

import web.Model.Car;
import org.springframework.stereotype.Component;


import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carsList;

    public CarServiceImpl() {
        List<Car> carsList = new ArrayList<>();
        carsList.add(new Car(1, "Skoda", "Black"));
        carsList.add(new Car(2, "BMV", "Grey"));
        carsList.add(new Car(3, "Lada", "Blue"));
        carsList.add(new Car(4, "Toyota", "Red"));
        carsList.add(new Car(5, "Renault", "Green"));
        this.carsList = carsList;
    }

    public List<Car> getCarsByNumber(Integer i) {
        List<Car> list = carsList;
        List<Car> resultList = new ArrayList<>();
        for (Car car : list) {
            if (list.indexOf(car) < i) {
                resultList.add(car);
            }
        }
        return resultList;
    }

    ;

}
