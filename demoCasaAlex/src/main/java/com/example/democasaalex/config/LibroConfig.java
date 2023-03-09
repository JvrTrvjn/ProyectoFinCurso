package com.example.democasaalex.config;

import com.example.democasaalex.Identity.Libro;
import com.example.democasaalex.repository.LibroRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class LibroConfig {
    @Bean
    CommandLineRunner commandLineRunner(LibroRepository repository){
        return args -> {
            Libro quijote = new Libro(1L,"El Quijote","Miguel de Cervantes","12096754",20);
            Libro viento = new Libro(2L,"El viento nos llevará","Monica Carrillo","12096734",17);
            Libro azami = new Libro(3L,"Azami","Aki Shimazaku","12096712",15);
            Libro huella = new Libro(4L,"La huella de infierno","Leigh Bardugo","12096721",18);
            Libro cuco = new Libro(5L,"El cuco de cristal","Javier Castillo","12096743",21);

            repository.saveAll(List.of(quijote,viento,azami,huella,cuco));
        };
    }


}
