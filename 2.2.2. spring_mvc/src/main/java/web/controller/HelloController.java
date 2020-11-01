package web.controller;

import Model.Car;
import Service.CarService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {

	@GetMapping(value = "/cars")
	public String printWelcome(@RequestParam(value = "count", required = false) Integer i, ModelMap model) {
		List<Car> list;
		if (i==null){ list = CarService.getCarsByNumber(5);
		}else if (i>0 &i<6) {
		list = CarService.getCarsByNumber(i);
	} else {
			list = CarService.getCarsByNumber(5);
		}
		System.out.println(list);
	model.addAttribute("cars", list);
	return "Cars";

	}
	
}