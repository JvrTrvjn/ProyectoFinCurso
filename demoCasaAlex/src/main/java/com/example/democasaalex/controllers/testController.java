package com.example.democasaalex.controllers;

import com.example.democasaalex.Identity.Libro;
import com.example.democasaalex.service.LibroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libreria")
public class testController {

/*    @Autowired
    private LibroServiceImpl libroServiceImpl;*/

/*    @RequestMapping("/libros/{libroId}")
    public Libro getLibro(@PathVariable Long libroId){
        return this.libroServiceImpl.getLibro(libroId);
    }*/

    @RequestMapping("/libros")
    public void simpleDisplayController(){
        System.out.println("Esto funciona.");
    }
}