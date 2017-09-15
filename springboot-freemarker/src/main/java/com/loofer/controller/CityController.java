package com.loofer.controller;


import com.loofer.domain.City;
import com.loofer.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class CityController {


    @Autowired
    private CityService cityService;

    @GetMapping("/api/city/{id}")
    public String findOneCity(Model model, @PathVariable Long id){
        model.addAttribute("city",cityService.findCityById(id));
        return "city";
    }

    @GetMapping("/api/cityList")
    public String findAllCity(Model model){
        List<City> cityList = cityService.findAllCity();
        model.addAttribute("cityList",cityList);
        return "cityList";
    }

}
