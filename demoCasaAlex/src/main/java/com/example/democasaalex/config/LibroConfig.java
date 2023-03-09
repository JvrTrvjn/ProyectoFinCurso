package com.example.democasaalex.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class LibroConfig implements CommandLineRunner {
     private final ILibroService libroService;

     public LibroConfig(ILibroService libroService){
         this.libroService = libroService;
     }

    @Override
    public void run(String... args) throws Exception {

    }
}
