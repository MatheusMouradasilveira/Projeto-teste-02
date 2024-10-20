package Model;

import DAO.LivroBancoDados;

public class LivroModel {

    int id;
    String titulo;
    String genero;
    int npaginas;
    String sinopse;
    String autornome;
    String autornacio;

    public LivroModel() {
    }

    public LivroModel(String titulo, String genero, int npaginas, String sinopse, String autornome, String autornacio) {
        this.titulo = titulo;
        this.genero = genero;
        this.npaginas = npaginas;
        this.sinopse = sinopse;
        this.autornome = autornome;
        this.autornacio = autornacio;
    }

    public LivroModel(int id, String titulo, String genero, int npaginas, String sinopse, String autornome, String autornacio) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.npaginas = npaginas;
        this.sinopse = sinopse;
        this.autornome = autornome;
        this.autornacio = autornacio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNpaginas() {
        return npaginas;
    }

    public void setNpaginas(int npaginas) {
        this.npaginas = npaginas;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String getAutornome() {
        return autornome;
    }

    public void setAutornome(String autornome) {
        this.autornome = autornome;
    }

    public String getAutornacio() {
        return autornacio;
    }

    public void setAutornacio(String autornacio) {
        this.autornacio = autornacio;
    }

    public void cadastrarLivroDAO(LivroModel livro){
        LivroBancoDados novoLivro = new LivroBancoDados();
        novoLivro.inserirLivroBD(livro);
    }
}