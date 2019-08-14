package ExercicioLoteria;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {


        System.out.println("Exercicio Loteria *********************************");
        Map<Integer, String> XPTO  = new HashMap<>();
        XPTO.put(0,"Ovos");
        XPTO.put(1,"Água");
        XPTO.put(2,"Escopeta");
        XPTO.put(3,"Cavalo");
        XPTO.put(4,"Dentista");
        XPTO.put(5,"Fogo");

        Map<String,String> ABC  = new HashMap<>();
        ABC.put("Joao","Juan, Fissura, Maromba");
        ABC.put("Miguel","Night Watch, Bruce Wayne, Tampinha");
        ABC.put("Maria","Wonder Woman, Mary, Marilene");
        ABC.put("Lucas","Lukinha, Jorge, George");

        System.out.println("***Lista com MAP 1*****");
        for (Integer ROT1 : XPTO.keySet()){
            String Mostra = XPTO.get(ROT1);
            System.out.println(ROT1 + " " +Mostra);
        }

        System.out.println("***Lista com MAP 2*****");
        for (String ROT2 : ABC.keySet()){
            String Mostra = ABC.get(ROT2);
            System.out.println(ROT2 + " - " +Mostra);
        }


    }
}
