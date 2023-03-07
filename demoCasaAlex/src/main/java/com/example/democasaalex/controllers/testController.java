package com.example.democasaalex.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/")
public class testController {
    @RequestMapping(value = "prueba")
    public String prueba(Model model){
        model.addAttribute("titulo","titulo de prueba");

        return model.getAttribute("titulo").toString();
    }
}
