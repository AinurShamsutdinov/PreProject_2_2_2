package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import web.model.Car;
import web.service.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String printCars(ModelMap model) {
        CarService carService = new CarService();
        List<String> messages = new ArrayList<>();
        messages.add("Cars!");
        model.addAttribute("messages", messages);
        model.addAttribute("allCars", carService.getCarList());
        return "cars";
    }
}