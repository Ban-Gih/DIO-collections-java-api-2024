package list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private final List<Livros> livrosList;

    public CatalogoLivros() {
        this.livrosList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livrosList.add(new Livros(titulo, autor, anoPublicacao));
    }

    public List<Livros> pesquisarPorAutor(String autor){
        List<Livros> livrosPorAutor = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if (l.getAutor().equalsIgnoreCase(autor)){
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livros> pesquisaPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livros> livrosPorIntervaloAnos = new ArrayList<>();
        if (!livrosList.isEmpty()){
            for (Livros l: livrosList){
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal){
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livros pesquisaPorTitulo(String titulo){
        Livros livroPorTitulo = null;
        if (!livrosList.isEmpty()){
            for (Livros l : livrosList){
                if (l.getTitulo().equalsIgnoreCase(titulo)){
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();
        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 2", 2022);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 3", 2023);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 4", 1990);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        System.out.println(catalogoLivros.pesquisaPorIntervaloAnos(2000, 2022));
        System.out.println(catalogoLivros.pesquisaPorTitulo("Livro 1"));
    }
}
