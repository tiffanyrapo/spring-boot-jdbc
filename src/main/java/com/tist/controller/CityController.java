package com.tist.controller;

import com.tist.domain.City;
import com.tist.service.CityService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

@Controller
public class CityController {
    @Resource
    private CityService cityService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        City city = new City();
        model.addAttribute("msg", "Hello Tiffany , this is freemarker");
        model.addAttribute("city", city);
//        return "hello";
//        return "redirect:/test";
        return "hello";

    }

    //@RequestMapping("/form-test")
    //@GetMapping("/form-test")
    @PostMapping("/form-test")
    public String formInput(City city, Model model, HttpServletRequest request) {
        System.out.println(city);
        model.addAttribute("list", cityService.findAll());
        request.getSession().setAttribute("userid", "test");
        return "form-target";
    }

    @RequestMapping("/test")
    public String test(HttpServletRequest request) {
        return "test";
    }
}