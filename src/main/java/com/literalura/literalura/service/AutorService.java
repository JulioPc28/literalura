package com.literalura.literalura.service;

import com.literalura.literalura.model.Autor;
import com.literalura.literalura.repository.AutorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AutorService {
    private final AutorRepository repo;

    public AutorService(AutorRepository repo) {
        this.repo = repo;
    }

    public List<Autor> listar() { return repo.findAll(); }
    public Autor guardar(Autor a) { return repo.save(a); }
}