package com.literalura.literalura.controller;

import com.literalura.literalura.model.Autor;
import com.literalura.literalura.service.AutorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/autores")
public class AutorController {
    private final AutorService service;

    public AutorController(AutorService service) {
        this.service = service;
    }

    @GetMapping
    public List<Autor> listar() {
        return service.listar();
    }

    @PostMapping
    public Autor crear(@RequestBody Autor autor) {
        return service.guardar(autor);
    }
}