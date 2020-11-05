package web.controller;

import web.Model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import java.util.List;

@Controller
public class CarController {

    private final
    CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }


    @GetMapping(value = "/cars")
    public String printWelcome(@RequestParam(value = "count", required = false) Integer i, ModelMap model) {
        List<Car> list;
        if (i == null) {
            list = carService.getCarsByNumber(5);
        } else if (i > 0 & i < 6) {
            list = carService.getCarsByNumber(i);
        } else {
            list = carService.getCarsByNumber(5);
        }
        System.out.println(list);
        model.addAttribute("cars", list);
        return "Cars";

    }
}
