package com.example.democasaalex.service;

import com.example.democasaalex.Identity.Libro;
import com.example.democasaalex.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


public class LibroServiceImpl implements LibroService {

    private LibroRepository libroRepository;

    /*@Override
    public Libro one(Long id) {
        Optional<Libro> optionalLibro = libroRepository.findById(id);
        return optionalLibro.get();
    }*/
}