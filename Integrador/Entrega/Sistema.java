package br.com.digitalhouse.Entrega;

import java.util.HashMap;

import java.util.IdentityHashMap;
import java.util.Map;

public class Sistema {


    public static void main(String[] args) {

        Livraria chamaLivro = new Livraria();

        //Cadastrando livros
        Livro nwLivro1 = new Livro(1,"Gibizão Turma da Mônica","Maurício de Souza",2019,12345678,3,10.00);
        Livro nwLivro2 = new Livro(2,"Cinco Minutos","José de Alencar",1997,22345678,5,30.00);
        Livro nwLivro3 = new Livro(3,"A Viuvinha","José de Alencar",1998,32345678,1,60.00);
        Livro nwLivro4 = new Livro(4,"Capitães da Areia","Jorge Amado",1950,42345678,2,20.00);
        Livro nwLivro5 = new Livro(5,"Clara dos Anjos","Lima Barreto",1960,52345678,10,10.00);


        //Listando em tela
        HashMap<Integer, String> ABC = new HashMap<>();

        ABC.put(nwLivro1.getLivroCodigo(),nwLivro1.getLivroTitulo());
        ABC.put(nwLivro2.getLivroCodigo(),nwLivro2.getLivroTitulo());
        ABC.put(nwLivro3.getLivroCodigo(),nwLivro3.getLivroTitulo());
        ABC.put(nwLivro4.getLivroCodigo(),nwLivro4.getLivroTitulo());
        ABC.put(nwLivro5.getLivroCodigo(),nwLivro5.getLivroTitulo());

        System.out.println("*Livros disponíveis *******");
        for (Integer ROT1 : ABC.keySet()){
            String Mostra = ABC.get(ROT1);
            System.out.println("  " + ROT1 + " - " + Mostra);
        }

        System.out.println("***************************\n");

        ///Adicionando ao list
        chamaLivro.addLivro(nwLivro1);
        chamaLivro.addLivro(nwLivro2);
        chamaLivro.addLivro(nwLivro3);
        chamaLivro.addLivro(nwLivro4);
        chamaLivro.addLivro(nwLivro5);

        //Consulta de um livro
        int consult = 4;
        System.out.println("Livro a ser consultado: ["+consult+"]");
        System.out.println("---------------------------------");
        chamaLivro.consultarLivro(consult);
        System.out.println("---------------------------------\n");


        //Venda de um livro
        Integer venda = 3;
        System.out.println("Livro a ser Comprado: ["+venda+"]");
        System.out.println("---------------------------------");
        chamaLivro.consultarLivro(venda);

        char conf = 'S';
        System.out.println("---------------------------------");
        System.out.println("Confirma compra do livro (S/N)?");
        if (conf=='S'){
            System.out.println("Resp: [" + conf + "]");
            System.out.println("Venda Concluída!!");

        }else{
            System.out.println("Resp: [" + conf + "]");
            System.out.println("Venda Cancelada");
        }
        System.out.println("---------------------------------");

        chamaLivro.vendaLivro(venda);


        System.out.println("---------------------------------\n");
        System.out.println("Fim do Programa");


    }
}