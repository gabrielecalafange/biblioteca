import Repository.UsuarioRepository;
import Service.UsuarioService;

public class Facade {
    private UsuarioRepository usuarios;
    public Facade() {
        this.usuarios = new UsuarioRepository();
    }

    public String fazerReserva(int idUser, int idLivro) {
        UsuarioService usuarioService = new UsuarioService(this.usuarios.getUsuario(idUser));
        return usuarioService.fazerReserva(idLivro);
    }

    public String listarLivros(int idUser) {
        UsuarioService usuarioService = new UsuarioService(this.usuarios.getUsuario(idUser));
        return usuarioService.listarLivros();
    }

    public String listarLivrosDisponiveis(int idUser) {
        UsuarioService usuarioService = new UsuarioService(this.usuarios.getUsuario(idUser));
        return usuarioService.listarLivrosDisponiveis();
    }
}
