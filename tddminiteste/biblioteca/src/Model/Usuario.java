package Model;

public class Usuario {

    private String nome;
    private int idUser;

    public Usuario(String nome, int id) {
        this.nome = nome;
        this.idUser = id;
    }
    public String getNome() {
        return nome;
    }

    public int getIdUser() {
        return idUser;
    }

}
