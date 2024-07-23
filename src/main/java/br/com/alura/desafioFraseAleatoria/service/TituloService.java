package br.com.alura.desafioFraseAleatoria.service;

import br.com.alura.desafioFraseAleatoria.dto.TituloDTO;
import br.com.alura.desafioFraseAleatoria.model.Titulo;
import br.com.alura.desafioFraseAleatoria.repository.TituloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class TituloService {

    private final Random random = new Random();

    @Autowired
    private TituloRepository repository;

    public List<TituloDTO> obterTitulos() {
        List<Titulo> titulos = repository.findAll();
        List<TituloDTO> titulosDTO = new ArrayList<>();
        titulos.forEach(t -> t.getPersonagens()
            .forEach(p -> {
                TituloDTO tituloDTO = new TituloDTO(t.getNome(), t.getPoster(), p.getNome(), p.getFrase());
                titulosDTO.add(tituloDTO);
            }));
        return titulosDTO;
    }

    public TituloDTO obterFraseAleatoria() {
        var titulosDTO = this.obterTitulos();
        var indiceQualquer = random.nextInt(titulosDTO.size());
        return titulosDTO.get(indiceQualquer);
    }
}
