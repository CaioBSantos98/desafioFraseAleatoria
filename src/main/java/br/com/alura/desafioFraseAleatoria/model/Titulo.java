package br.com.alura.desafioFraseAleatoria.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "titulos")
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String nome;
    private String poster;
    @Enumerated(EnumType.STRING)
    private CategoriaTitulo categoria;

    @OneToMany(mappedBy = "titulo")
    private List<Personagem> personagens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }

    public CategoriaTitulo getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaTitulo categoria) {
        this.categoria = categoria;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }

    @Override
    public String toString() {
        return "Titulo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", poster='" + poster + '\'' +
                ", categoria=" + categoria +
                ", personagens=" + personagens +
                '}';
    }
}
