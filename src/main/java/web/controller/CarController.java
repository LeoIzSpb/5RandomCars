package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDao;

@Controller

public class CarController {

    private final CarDao carDao;

    @Autowired
    public CarController(CarDao carDao) { this.carDao = carDao; }

    @GetMapping(value = "/cars")
    public String getCarsByCount(Model model, @RequestParam(value = "count", defaultValue = "5") int count) {
        model.addAttribute("cars",carDao.getCarsByCount(count));
        return "car_index";
    }

}
