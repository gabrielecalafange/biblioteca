package Model;

import Model.Livro;
import Model.Usuario;

public class Reserva {

    private Usuario usuario;
    private Livro livro;

    public Reserva(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
    }
}
