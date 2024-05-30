package list.operacoesBasicas;



import java.util.ArrayList;
import java.util.List;

public class ListaDeCompras {
    private List<Itens> itensList;

    public ListaDeCompras() {
        super();
        this.itensList = new ArrayList<>();
    }

    public void adicionarItens(String descricao) {
        itensList.add(new Itens(descricao));
    }

    public void removerItens(String descricao) {
        List<Itens> itensParaRemover = new ArrayList<>();

        for (Itens i : itensList) {
            if (i.getDescricao().equalsIgnoreCase(descricao)) {
                itensParaRemover.add(i);
            }
        }
        itensList.removeAll(itensParaRemover);
    }

    public int obterNumeroTotalItens() {
        return itensList.size();
    }

    public void obterDescricaoItens() {
        System.out.println(itensList);
    }

    public static void main(String[] args) {
        ListaDeCompras listaItens = new ListaDeCompras();
        System.out.println("O numero total de itens e: " + listaItens.obterNumeroTotalItens());

        listaItens.adicionarItens("arroz");
        listaItens.adicionarItens("feijao");
        listaItens.adicionarItens("carne");
        listaItens.adicionarItens("macarrao");
        listaItens.adicionarItens("batata");
        System.out.println("O numero total de itens e: " + listaItens.obterNumeroTotalItens());

        listaItens.removerItens("macarrao");
        System.out.println("O numero total de itens e: " + listaItens.obterNumeroTotalItens());

        listaItens.obterDescricaoItens();
    }

}

