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
    private Person person = new Person();

    @GetMapping("/")
    public ModelAndView root(){
        return new ModelAndView("redirect:/home");
    }

    @GetMapping("/home")
    public String home(Model model){
        Ability ability1 = new Ability();
        ability1.setName("Desarallo ETL");
        ability1.setType("Destreza");
        ability1.setStatus("Avanzado");
        ability1.setDate("2015/11/15");

        listAbility.add(ability1);


        person.setName("Jhon David");
        person.setLastName("Caicedo Alvarez");
        person.setEmail("jhon-caicedot@gtccorporation.com");
        person.setGender("Masculino");
        model.addAttribute("person", person);
        model.addAttribute("listAbility", listAbility);
        return "home";
    }

    @GetMapping("/contact")
    public String contact(){
        return "contact";
    }

    @GetMapping("/data")
    public String data(Model model){
        model.addAttribute("person", person);
        return "data";
    }

    @GetMapping("/project")
    public String project(){
        return "project";
    }


}