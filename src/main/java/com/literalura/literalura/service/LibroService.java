package com.literalura.literalura.service;

import com.literalura.literalura.model.Libro;
import com.literalura.literalura.repository.LibroRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibroService {
    private final LibroRepository repo;

    public LibroService(LibroRepository repo) {
        this.repo = repo;
    }

    public List<Libro> listar() { return repo.findAll(); }
    public List<Libro> porIdioma(String idioma) { return repo.findByIdioma(idioma); }
    public Libro guardar(Libro l) { return repo.save(l); }
}