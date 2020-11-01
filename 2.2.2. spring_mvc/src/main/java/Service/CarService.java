package Service;

import Model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    public static List<Car> getCarsByNumber (Integer i){
      List<Car> list = Car.createList();
      List<Car> resultList = new ArrayList<>();
      for (Car car: list){
          if (list.indexOf(car)<i){
              resultList.add(car);
          }
      }
      return resultList;
    };

}
