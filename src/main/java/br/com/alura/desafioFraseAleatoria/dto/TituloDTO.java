package br.com.alura.desafioFraseAleatoria.dto;

import br.com.alura.desafioFraseAleatoria.model.Personagem;

public record TituloDTO(
        String titulo,
        String poster,
        String personagem,
        String frase
) {
}
