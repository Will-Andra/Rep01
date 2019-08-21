package br.com.digitalhouse.Entrega;

import java.util.ArrayList;
import java.util.List;

public class Livraria {
    public Livro lvr;
    Livro busca = null;

    private List<Livro> livroStock = new ArrayList<>();

    public void addLivro(Livro livro) {
        livroStock.add(livro);
    }

    public void consultarLivro(Integer codigo) {
        int confere = 0;
        for (Livro busca:livroStock) {
            if (codigo == busca.getLivroCodigo()) {
                System.out.println(busca.toString());
                confere = 1;
            }
        }
        if(confere== 0) {
            System.out.println("Livro não localizado");
        }

    }

    public void vendaLivro(Integer codigolv){
//        //Se fosse para excluir o livro usar o codigo comentado abaixo
//        livroStock.remove((codigolv-1));
//        for (Livro busca:livroStock) {
//                System.out.println(busca.toString());
//            }

        Integer asd = 0;
        for (Livro buscas:livroStock) {
            if (codigolv == buscas.getLivroCodigo()) {
                if (buscas.getLivroQtdEstoque()>0) {
                asd = (buscas.getLivroQtdEstoque()-1);
                    buscas.setLivroQtdEstoque(asd);
                    System.out.println("\nSaldo em estoque pós venda \n" +
                            "--------------------------------------\n"+
                            "Código: " + buscas.getLivroCodigo() + "\n" +
                            "Livro: " + buscas.getLivroTitulo() + "\n" +
                            "Qtd em Estoque: " + buscas.getLivroQtdEstoque());
                }else{
                    System.out.println("Quantidade de Livro Esgotado para venda! \nVenda Cancelada!");
                }
            }
       }

        }}



