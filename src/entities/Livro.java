package entities;

public class Livro {

    private int id;
    private String titulo;
    private int ano;
    private int autorId;

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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getAutorId() {
        return autorId;
    }

    public void setAutorId(int autorId) {
        this.autorId = autorId;
    }

    public String toString() {
        return id + ", " + titulo + ", " + "Ano: " + ano + ", " + "Id autor: " + autorId;
    }
}
