package set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisaPorNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatoSet){
            if (c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet){
            if (c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContato();


        agendaContatos.adicionarContato("Jeovane", 12345);
        agendaContatos.adicionarContato("Jeovane", 0);
        agendaContatos.adicionarContato("Jeovane Viana", 1111);
        agendaContatos.adicionarContato("Santos", 1111);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisaPorNome("Jeovane"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Jeovane Viana", 77777));

        agendaContatos.exibirContato();
    }
}
