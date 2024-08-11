package Repository;

import Model.Usuario;

import java.util.HashMap;

public class UsuarioRepository {

    private HashMap<Integer, Usuario> usuarios;

    public UsuarioRepository() {
        this.usuarios = new HashMap<>();
    }
    public void adicionaUsuario(int id, Usuario usuario) {
        this.usuarios.put(id, usuario);
    }

    public void removeUsuario(int id) {
        this.usuarios.remove(id);
    }

    public Usuario getUsuario(int id) {
        return this.usuarios.get(id);
    }

    public void deletarTudo() {
        this.usuarios = new HashMap<>();
    }
}
