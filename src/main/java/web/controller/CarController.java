package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImpl;

@Controller
public class CarController {

    CarServiceImpl carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    public String getCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("carList", carService.getCars(count));
        return "cars";
    }

}
