package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> catalogoLivros;

    public CatalogoLivros() {
        this.catalogoLivros = new ArrayList<>();
    }

    // ADICIONAR
    public void adicionarLivro(Livro livro) {
        catalogoLivros.add(livro);
    }

    // POR AUTOR
    public List<Livro> pesquisarPorAutor (String autor){
        List<Livro> listaPorAutor = new ArrayList<>();
        if (!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros) {
                if (livro.getAutor().equalsIgnoreCase(autor)) {
                    listaPorAutor.add(livro);
                }
            }
        }
        return listaPorAutor;
    }

    // POR INTERVALO
    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> listaPorIntervalo = new ArrayList<>();
        if (!catalogoLivros.isEmpty()){
            for (Livro livro : catalogoLivros) {
                if (livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    listaPorIntervalo.add(livro);
                }
            }
        }
        return listaPorIntervalo;
    }

    // POR TITULO
    public Livro pesquisarPorTitulo (String titulo){
        Livro livro = new Livro("*** não encontrado!!!","",0);
        if (!catalogoLivros.isEmpty()){
            for (Livro l : catalogoLivros) {
                if (l.getTitulo() == titulo) {
                    livro = l;
                    break;
                }
            }
        }
        return livro;
    }

    public int getQuantidadeLivros() {
        return this.catalogoLivros.size();
    }

    public List<Livro> getcatalogoLivros() {
        return catalogoLivros;
    }

}