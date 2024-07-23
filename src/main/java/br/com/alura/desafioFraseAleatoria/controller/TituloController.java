package br.com.alura.desafioFraseAleatoria.controller;

import br.com.alura.desafioFraseAleatoria.dto.TituloDTO;
import br.com.alura.desafioFraseAleatoria.service.TituloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/series")
public class TituloController {

    @Autowired
    private TituloService service;

    @GetMapping
    public List<TituloDTO> obterTitulos() {
        return service.obterTitulos();
    }

    @GetMapping("/frases")
    public TituloDTO obterFraseAleatoria() {
        return service.obterFraseAleatoria();
    }
}
