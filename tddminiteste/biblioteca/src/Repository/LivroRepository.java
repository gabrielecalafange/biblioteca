package Repository;

import Model.Livro;

import java.util.*;

public class LivroRepository {

    private HashMap<Integer, Livro> livros;

    public LivroRepository() {
        this.livros = new HashMap<>();
    }

    public void adicionaLivro(int id, Livro livro) {
        this.livros.put(id, livro);
    }

    public void removeLivro(int id) {
        this.livros.remove(id);
    }

    public Livro getLivro(int id) {
        return this.livros.get(id);
    }

    public String listarLivros() {

        ArrayList<String> lista = new ArrayList<>();

        for (Map.Entry<Integer, Livro> entry: livros.entrySet()) {
            lista.add(entry.getValue().getTitulo());
        }
        return String.valueOf(lista);
    }

    public String listarLivrosDisponiveis() {

        ArrayList<String> lista = new ArrayList<>();

        for (Map.Entry<Integer, Livro> entry: livros.entrySet()) {

            Livro livro = entry.getValue();

            if (livro.getDisponibilidade()) {
                lista.add(livro.getTitulo());
            }
        }
        return String.valueOf(lista);
    }

    public void deletarTudo() {
        this.livros = new HashMap<>();
    }

}
