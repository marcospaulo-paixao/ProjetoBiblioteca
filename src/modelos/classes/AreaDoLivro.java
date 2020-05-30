package modelos.classes;

public class AreaDoLivro {

    int id = 0;
    String descricao = "";

    public AreaDoLivro(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    public AreaDoLivro() {

    }

    public AreaDoLivro(AreaDoLivro objArea) {
        this.id = objArea.getId();
        this.descricao = objArea.getDescricao();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return id + ";" + descricao;
    }

}
