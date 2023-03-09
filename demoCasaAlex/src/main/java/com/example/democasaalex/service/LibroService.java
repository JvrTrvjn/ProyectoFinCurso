package com.example.democasaalex.service;

import com.example.democasaalex.Identity.Libro;
import com.example.democasaalex.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibroService implements ILibroService{
    private final LibroRepository libroRepository;

    @Autowired
    public LibroService(LibroRepository libroRepository) {
        this.libroRepository = libroRepository;
    }
    @Override
    public Optional<Libro> findById(Long id) {
        return libroRepository.findById(id);
    }

    }
