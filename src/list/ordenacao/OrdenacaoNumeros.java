package list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosList;

    public OrdenacaoNumeros() {
        this.numerosList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosList.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        if (!numerosList.isEmpty()) {
            List<Integer> ascendente = new ArrayList<>(numerosList);
            Collections.sort(ascendente);
            return ascendente;
        }
        throw new RuntimeException("Erro: a lista está vazia");
    }

    public List<Integer> ordenarDescendente(){
        if(!numerosList.isEmpty()){
            List<Integer> descendente = new ArrayList<>(numerosList);
            Collections.sort(descendente.reversed());
            return descendente;
        }
        throw new RuntimeException("Erro: a lista está vazia");
    }

    public static void main(String[] args) {
        OrdenacaoNumeros numeros = new OrdenacaoNumeros();

        numeros.adicionarNumero(2);
        numeros.adicionarNumero(1);
        numeros.adicionarNumero(4);
        numeros.adicionarNumero(3);
        numeros.adicionarNumero(5);

        System.out.println(numeros.ordenarDescendente());
        System.out.println(numeros.ordenarAscendente());
    }
}
