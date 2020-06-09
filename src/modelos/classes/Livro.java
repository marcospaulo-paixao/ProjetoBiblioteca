package modelos.classes;

public class Livro {

    int id = 0;
    int codigo = 0;
    String isbn = "";
    String titulo = "";
    Editora editora = null;
    Autor autor = null;
    AreaDoLivro areaDoLivro = null;

    public Livro(int id, int codigo, String isbn, String titulo, Editora editora, Autor autor, AreaDoLivro areaDoLivro) {
        this.id = id;
        this.codigo = codigo;
        this.isbn = isbn;
        this.titulo = titulo;
        this.editora = new Editora(editora.getId(), editora.getNome(), editora.getDescricao());
        this.autor = new Autor(autor.getId(), autor.getNome());
        this.areaDoLivro = new AreaDoLivro(areaDoLivro.getId(), areaDoLivro.getDescricao());
    }

    public Livro() {

    }

    public Livro(Livro livro) {
        this.id = livro.getId();
        this.codigo = livro.getCodigo();
        this.isbn = livro.getIsbn();
        this.titulo = livro.getTitulo();
        this.editora = livro.getEditora();
        this.autor = livro.getAutor();
        this.areaDoLivro = livro.getAreaDoLivro();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Editora getEditora() {
        return editora;
    }

    public void setEditora(Editora editora) {
        this.editora = editora;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public AreaDoLivro getAreaDoLivro() {
        return areaDoLivro;
    }

    public void setAreaDoLivro(AreaDoLivro areaDoLivro) {
        this.areaDoLivro = areaDoLivro;
    }

    @Override
    public String toString() {
        return id + ";" + codigo + ";" + isbn + ";" + titulo + ";"
                + editora.getId() + ";" + autor.getId()
                + ";" + areaDoLivro.getId() + ";";
    }
}
