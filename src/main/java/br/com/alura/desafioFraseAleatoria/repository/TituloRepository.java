package br.com.alura.desafioFraseAleatoria.repository;

import br.com.alura.desafioFraseAleatoria.model.Titulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TituloRepository extends JpaRepository<Titulo, Long> {

}
