package models;

import java.util.Locale;

public class Livro {

    private String nome;
    private String genero;
    private String autor;
    private String editora;
    private String ano;
    private String preco;

    public Livro(String nome, String genero, String autor, String editora, String ano, String preco) {
        this.nome = nome;
        this.genero = genero;
        this.autor = autor;
        this.editora = editora;
        this.ano = ano;
        this.preco = preco;
    }
      
    
    public Livro(){
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Livro{" + "nome=" + nome + ", genero=" + genero + ", autor=" + autor + ", editora=" + editora + ", ano=" + ano + ", preco=" + String.format("%.2f", Double.valueOf(preco)) + '}';
    }


    
    
    
    
}
