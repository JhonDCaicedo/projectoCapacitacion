package com.example.capacitacionJava.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import java.util.ArrayList;
import java.util.Date;

@Controller
public class AppController {

    private ArrayList<Ability> listAbility = new ArrayList();

    @GetMapping("/")
    public ModelAndView root(){
        return new ModelAndView("redirect:/home");
    }

    @GetMapping("/home")
    public String home(){
        return "home";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/data")
    public String data(){
        return "data";
    }

    @GetMapping("/project")
    public String project(){
        return "project";
    }


}