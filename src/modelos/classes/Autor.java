package modelos.classes;

public class Autor {

    private int id = 0;
    private String nome = "";

    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Autor() {
        this.id = id;
        this.nome = nome;
    }

    public Autor(Autor objAutor) {
        this.id = objAutor.getId();
        this.nome = objAutor.getNome();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return id + ";" + nome+";";
    }
}
