package list.operacoesBasicas;

public class Itens {
    public String descricao;

    public Itens(String descricao) {
        super();
        this.descricao = descricao;
    }

    public String getDescricao() {

        return descricao;
    }

    @Override
    public String toString() {
        return descricao;
    }


}

