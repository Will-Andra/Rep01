package Exec2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListaVazia {

    public static void main(String[] args) {


        System.out.println("* Lista com List, mostra conforme as entradas (repete) **********");
        List<Integer> Conta = new ArrayList<>();
        Conta.add(1);
        Conta.add(5);
        Conta.add(5);
        Conta.add(6);
        Conta.add(7);
        Conta.add(8);
        Conta.add(8);
        Conta.add(8);

        for (Integer Executa: Conta){
            System.out.println(Executa);
        }

        System.out.println("* Lista com Set (Não repete Valores **********");

        Set<Integer> Sequencia = new HashSet<>();
        Sequencia.add(1);
        Sequencia.add(5);
        Sequencia.add(5);
        Sequencia.add(6);
        Sequencia.add(7);
        Sequencia.add(8);
        Sequencia.add(8);
        Sequencia.add(8);

        for(Integer Rotina: Sequencia){
            System.out.println(Rotina);
        }

    }
}
