package Service;

import Model.Livro;
import Model.Reserva;
import Model.Usuario;
import Repository.LivroRepository;

public class UsuarioService {
    private LivroRepository livros;
    private Usuario usuario;
    public UsuarioService(Usuario usuario) {
        this.usuario = usuario;
        this.livros = new LivroRepository();
    }
    public String listarLivros() {
        return this.livros.listarLivros();
    }
    public String listarLivrosDisponiveis() {
        return this.livros.listarLivrosDisponiveis();
    }
    public String fazerReserva(int idLivro) {
        Livro livro = this.livros.getLivro(idLivro);

        if (livro.getDisponibilidade()) {
            livro.alugar();
            new Reserva(this.usuario, livro);
            return "livro reservado com sucesso!";}

        return "livro indisponível";
    }
}
