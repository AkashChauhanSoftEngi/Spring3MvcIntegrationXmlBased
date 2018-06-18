package com.project.controller;

import com.project.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class Welcome {

    @Value("#{countryOptions}")
    private Map<String,String> countryOptions;

    @RequestMapping(value = "/")
    public String getWelcome(ModelMap model){
        model.addAttribute("message","sent from the Welcome controller");
        return "welcome";
    }

    @RequestMapping(value = "/processFormFirst", method= RequestMethod.GET)
    public String getForm(ModelMap model){
        model.addAttribute("message","This is Form firstForm");
        Employee employee = new Employee();
        employee.setFirstName("Anurag");
        employee.setLastName("Pundir");
        model.addAttribute("employee", employee);
        model.addAttribute("countryOptions", countryOptions);
        return "firstForm";
    }

    @RequestMapping(value = "/processFormSecond", method = RequestMethod.POST)
    public ModelAndView getValue(@ModelAttribute("employee") Employee employee){
        ModelAndView model = new ModelAndView();
        model.addObject("msg", "This is from processFormSecond");
        model.addObject("firstName", employee.getFirstName());
        model.addObject("lastName", employee.getLastName());
        model.addObject("country", employee.getCountry());
        model.setViewName("formSecond");
        return model;
    }

    @RequestMapping(value = "/processFormThird")
    public ModelAndView getThirdForm(@RequestParam("firstName") String employeeName){
        ModelAndView model = new ModelAndView();
        model.setViewName("formThird");
        model.addObject("msg","This is from @RequestParam");
        model.addObject("name",employeeName);
        return model;
    }


    @RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name,ModelMap map) {

        ModelAndView model = new ModelAndView();
        model.setViewName("test");
        model.addObject("msg", name);
        return model;
    }

}
