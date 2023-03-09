package com.example.democasaalex.controllers;

import com.example.democasaalex.Identity.Libro;
import com.example.democasaalex.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "/")
public class testController {

    private final LibroService libroService;

    @Autowired
    public testController(LibroService libroService) {
        this.libroService = libroService;
    }

    @RequestMapping(value = "prueba")
    public List<Libro> getLibros(){
        return libroService.getLibros();
    }
}
