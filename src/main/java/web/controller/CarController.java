package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.config.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        CarService carService = new CarServiceImpl();
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("blue","2000","BMW"));
        cars.add(new Car("green","2001","Volvo"));
        cars.add(new Car("white","2002","Volkswagen"));
        cars.add(new Car("orange","2003","Lada"));
        cars.add(new Car("black","2004","Porsche"));
        cars = carService.getCarByCount(cars,allCars);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
