package com.example.democasaalex.controllers;
import com.example.democasaalex.Identity.Libro;
import com.example.democasaalex.repository.LibroRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping
public class testController {

    private final LibroRepository repository;

    public testController(LibroRepository repository) {
        this.repository = repository;
    }
/*    @Autowired
    private LibroServiceImpl libroServiceImpl;*/

   @GetMapping("/libreria")
    public List<Libro> all(){
        return repository.findAll();
    }

    @GetMapping("/libros/{id}")
    public Libro one(@PathVariable Long id){
       return null; //repository.findById(id);
    }
}