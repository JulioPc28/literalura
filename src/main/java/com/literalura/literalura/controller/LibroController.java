package com.literalura.literalura.controller;

import com.literalura.literalura.model.Libro;
import com.literalura.literalura.service.LibroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/libros")
public class LibroController {
    private final LibroService service;

    public LibroController(LibroService service) {
        this.service = service;
    }

    @GetMapping
    public List<Libro> listar() {
        return service.listar();
    }

    @GetMapping("/idioma/{idioma}")
    public List<Libro> porIdioma(@PathVariable String idioma) {
        return service.porIdioma(idioma);
    }

    @PostMapping
    public Libro crear(@RequestBody Libro libro) {
        return service.guardar(libro);
    }
}