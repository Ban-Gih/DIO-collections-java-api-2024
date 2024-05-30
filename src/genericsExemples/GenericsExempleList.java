package genericsExemples;

import java.util.ArrayList;
import java.util.List;

public class GenericsExempleList {
    public static void main(String[] args) {

        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Elemento 1");
        listaSemGenerics.add(10);

        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        for (String elemento : listaGenerics) {
            System.out.println(elemento);
        }

        for (Object elemento : listaSemGenerics) {
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}

