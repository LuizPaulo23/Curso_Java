package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sobrecarga {
    public static void main(String[] args) {
        // String[] -> Fixo
        // new ArrayList <String>() Dinâmicos

        List<String> names = new ArrayList<>();
        // Adicionar elementos no array

        names.add("names3");
        names.add("names1");
        names.add("names2");



        //ordenando os elementos
        Collections.sort(names);
        // elemento de retorno
        for(String name : names){
            System.out.println(name);

        }
        // buscando elemento via get
        for (int i = 0; i < names.size(); i++){

            System.out.println(names.get(i));

        }

        //int index = names.indexOf("names1");
        System.out.println(names.indexOf("names1"));
        System.out.println(names.isEmpty());
        System.out.println(names.contains("names14"));
        System.out.println(names.size());

        // limpar a lista
        names.clear();
        System.out.println(names.isEmpty());


    }


}
