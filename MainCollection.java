package DH;

import java.util.*;

public class Main {

        public static void main(String [] args){


            System.out.println("* HashSet *******************");
            Set<String> conjunto = new HashSet<>();
            conjunto.add("Erika");
            conjunto.add("Jessica");
            conjunto.add("Camila");
            conjunto.add("Rafa");

            for (String valor: conjunto){
                System.out.println(conjunto);
            }

            System.out.println("* MAP *******************");

            //Criar o Dicionário
            Map<Integer, String> mapa = new HashMap<>();

            //Adiciona por Chave Valor
            mapa.put (4, "Fizemos 4 gols contra você");
            mapa.put(1, "Fizemos 2 gols contra você");
            mapa.put(2, "Fizemos 1 gols contra você");

            // Remover por chave
            //mapa.remove(4);

            // Percorre todos os valores
            for (Integer chave : mapa.keySet()){
                String valor = mapa.get(chave);
                System.out.println(valor);
            }

            System.out.println("* ARRAY - Indice / String *******************");

            // Array List
            List<String> lista = new ArrayList();
            lista.add("Alberto");
            lista.add("Clementina");
            lista.add("Irineu");
            lista.add("Maria");


            //Remove por indice e por String
            //lista.remove(1);

            for (String valors: lista){
                System.out.println(valors);
            }

        }
    }

