package Model;

import java.lang.invoke.StringConcatFactory;

public class Livro {

    private String titulo;
    private String autor;
    private int idLivro;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int id) {
        this.titulo = titulo;
        this.autor = autor;
        this.idLivro = id;
        this.disponibilidade = true;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean getDisponibilidade() {
        return this.disponibilidade;
    }

    public int getIdLivro() {
        return idLivro;
    }

    public void alugar() {
        if (disponibilidade) {this.disponibilidade = false;}
    }

    public void redisponibilizar() {
        this.disponibilidade = true;
    }

    @Override
    public String toString() {
        return "título: " + getTitulo();
    }
}