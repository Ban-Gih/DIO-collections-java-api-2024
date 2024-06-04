package set.operacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if (c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados(){
        return  convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidado.adicionarConvidado("Convidado 1", 11);
        conjuntoConvidado.adicionarConvidado("Convidado 2", 11);
        conjuntoConvidado.adicionarConvidado("Convidado 3", 13);
        conjuntoConvidado.adicionarConvidado("Convidado 4", 14);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(14);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " dentro do Set de convidados");

        conjuntoConvidado.exibirConvidados();
    }
}
