package br.com.digitalhouse.Entrega;

public class Livro {
    private Integer livroCodigo;
    private String livroTitulo;
    private String livroAutor;
    private Integer livroAno;
    private double livroIsbn;
    private Integer livroQtdEstoque;
    private double livroPreco;

    public Livro(Integer livroCodigo, String livroTitulo, String livroAutor, Integer livroAno, double livroIsbn, Integer livroQtdEstoque, double livroPreco) {
        this.livroCodigo = livroCodigo;
        this.livroTitulo = livroTitulo;
        this.livroAutor = livroAutor;
        this.livroAno = livroAno;
        this.livroIsbn = livroIsbn;
        this.livroQtdEstoque = livroQtdEstoque;
        this.livroPreco = livroPreco;
    }

    public Integer getLivroCodigo() {
        return livroCodigo;
    }

    public String getLivroTitulo() {
        return livroTitulo;
    }

    public String getLivroAutor() {
        return livroAutor;
    }

    public int getLivroAno() {
        return livroAno;
    }

    public double getLivroIsbn() {
        return livroIsbn;
    }

    public Integer getLivroQtdEstoque() {
        return livroQtdEstoque;
    }

    public void setLivroCodigo(Integer livroCodigo) {
        this.livroCodigo = livroCodigo;
    }

    public void setLivroTitulo(String livroTitulo) {
        this.livroTitulo = livroTitulo;
    }


    public void setLivroAutor(String livroAutor) {
        this.livroAutor = livroAutor;
    }

    public void setLivroAno(Integer livroAno) {
        this.livroAno = livroAno;
    }


    public void setLivroIsbn(double livroIsbn) {
        this.livroIsbn = livroIsbn;
    }

    public void setLivroPreco(double livroPreco) {
        this.livroPreco = livroPreco;
    }


    public void setLivroQtdEstoque(Integer livroQtdEstoque) {
        this.livroQtdEstoque = livroQtdEstoque;
    }

    @Override
    public String toString() {
        return " Código do Livro: " + livroCodigo +
                "\n Título do Livro: " + livroTitulo +
                "\n Autor: " + livroAutor +
                "\n Ano Publicação: " + livroAno +
                "\n ISBN: " + livroIsbn +
                "\n Quantidade em Estoque :" + livroQtdEstoque +
                "\n Preco: R$ " + livroPreco;
    }
}
