import java.util.List;

import list.OperacoesBasicas.*;
import list.Ordenacao.OrdenacaoPessoas;
import list.Ordenacao.OrdenacaoNumeros;
import list.Pesquisa.*;
import set.OperacoesBasicas.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println();
        System.out.println("------------- Collections ----------------");

        //operacoesListaTarefas();
        //operacoesCarrinho();
        //operacoesLivros();
        //operacoesNumeros();
        //operacoesOrdenacao1();
        //operacoesOrdenacao2();
        operacoesSet();
        
        System.out.println("------------------------------------------");

    }

    public static void operacoesListaTarefas(){
        ListaTarefas minhaListaTarefas = new ListaTarefas();

        System.out.println("Quantidade de tarefas: " + minhaListaTarefas.getTotalTarefas());

        minhaListaTarefas.adcionarTarefa("Primeira Tarefa");
        minhaListaTarefas.adcionarTarefa("Segunda Tarefa");
        minhaListaTarefas.adcionarTarefa("Terceira Tarefa");

        System.out.println("Quantidade de tarefas: " + minhaListaTarefas.getTotalTarefas());

        minhaListaTarefas.getDescricaoTarefas();

        minhaListaTarefas.removerTarefa("segunda tarefa");

        System.out.println("Depois da tarefa removida:");
        minhaListaTarefas.getDescricaoTarefas();
    }

    public static void operacoesCarrinho(){
        CarrinhoCompras meuCarrinhoCompras = new CarrinhoCompras();
        System.out.println("Quantidade de itens: " + meuCarrinhoCompras.calcularValorTotal());

        meuCarrinhoCompras.adicionarItem("Sabao", 2.0, 3);
        meuCarrinhoCompras.adicionarItem("Arroz", 1.0, 2);
        meuCarrinhoCompras.adicionarItem("Feijao", 4.0, 5);

        System.out.println("Valor total do carrinho: " + meuCarrinhoCompras.calcularValorTotal());
        meuCarrinhoCompras.exibirItens();

        meuCarrinhoCompras.removerItem("Arroz");

        System.out.println("Depois da item removido:");
        System.out.println("Valor total do carrinho: " + meuCarrinhoCompras.calcularValorTotal());
        meuCarrinhoCompras.exibirItens();
    }

    public static void operacoesLivros(){
        
        CatalogoLivros meuCatalogoLivros = new CatalogoLivros();

        System.out.println("Quantidade de livros: " + meuCatalogoLivros.getQuantidadeLivros());

        Livro meuLivro = new Livro("João e o Pé de Feijão", "Antonio Banderas", 2000);
        meuCatalogoLivros.adicionarLivro(meuLivro);
        Livro meuLivro2 = new Livro("MobyDick", "antonio banderas", 2001);
        meuCatalogoLivros.adicionarLivro(meuLivro2);
        Livro meuLivro3 = new Livro("Memórias Póstumas de Brás Cubas", "Machado de Assis", 1940);
        meuCatalogoLivros.adicionarLivro(meuLivro3);
        Livro meuLivro4 = new Livro("Inferno", "Dan Brown", 2002);
        meuCatalogoLivros.adicionarLivro(meuLivro4);

        System.out.println("Nova Quantidade de livros: " + meuCatalogoLivros.getQuantidadeLivros());

        // Por Autor
        System.out.println("--- POR AUTOR ---");
        List<Livro> porAutor = meuCatalogoLivros.pesquisarPorAutor("antonio Banderas");
        for (Livro livro : porAutor) {
            System.out.println(livro);
        }

        // Por intervalo de ano
        System.out.println("--- POR INTERVALO ---");
        List<Livro> porIntervalo = meuCatalogoLivros.pesquisarPorIntervaloAnos(2000 , 2005);
        for (Livro livro : porIntervalo) {
            System.out.println(livro);
        }

        // Por titulo
        System.out.println("--- POR TÍTULO ---");
        System.out.println(meuCatalogoLivros.pesquisarPorTitulo("João e o Pé de Feijão"));
        
    }

    public static void operacoesNumeros(){
        
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(37);
        somaNumeros.adicionarNumero(1150);
        somaNumeros.adicionarNumero(252);
        somaNumeros.adicionarNumero(24);
        somaNumeros.adicionarNumero(80);
        somaNumeros.adicionarNumero(1);

        System.out.println("SOMA: " + somaNumeros.calcularSoma());
        System.out.println("MAIOR NUMERO: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("MENOR NUMERO: " + somaNumeros.encontrarMenorNumero());
        somaNumeros.exibirNumeros();
        
    }


    public static void operacoesOrdenacao1(){
        
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adcionarPessoa("joao", 7, 1.65);
        ordenacaoPessoas.adcionarPessoa("jose", 20, 1.92);
        ordenacaoPessoas.adcionarPessoa("pedro", 80, 1.50);
        ordenacaoPessoas.adcionarPessoa("maria", 15, 1.77);
        ordenacaoPessoas.adcionarPessoa("ernesto", 30, 1.66);

        System.out.println("POR IDADE");
        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println("POR ALTURA");
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        
    }

    public static void operacoesOrdenacao2(){
        
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumeros(8);
        ordenacaoNumeros.adicionarNumeros(1);
        ordenacaoNumeros.adicionarNumeros(18);
        ordenacaoNumeros.adicionarNumeros(88);
        ordenacaoNumeros.adicionarNumeros(3);
        ordenacaoNumeros.adicionarNumeros(668);
        ordenacaoNumeros.adicionarNumeros(87);
        ordenacaoNumeros.adicionarNumeros(43);


        System.out.println("ASCENDENTE");
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println("DESCENDENTE");
        System.out.println(ordenacaoNumeros.ordenarDescendente());
        
    }

    public static void operacoesSet(){
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Quantidade de convidados: " + conjuntoConvidados.contarConvidados());

        conjuntoConvidados.adicionarConvidado("Joao", 1);
        conjuntoConvidados.adicionarConvidado("Pedro", 2);
        conjuntoConvidados.adicionarConvidado("Jose", 3);
        conjuntoConvidados.adicionarConvidado("Maria", 4);
        conjuntoConvidados.adicionarConvidado("Outro", 4);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(3);
        
        conjuntoConvidados.exibirConvidados();


        System.out.println("Quantidade FINAL de convidados: " + conjuntoConvidados.contarConvidados());

    }

}
