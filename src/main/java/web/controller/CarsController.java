package web.controller;

import web.model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.CarServiceImp;

import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {


    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String printCars(ModelMap model) {
        CarServiceImp carServiceImp = new CarServiceImp();
        List<Car> cars = carServiceImp.getAllCars();
        model.addAttribute("cars", cars);
        model.addAttribute("language", "en");
        return "cars";
    }
}


