package OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoCompras {
    
    private List<Item> carrinhoCompras;

    public CarrinhoCompras() {
        this.carrinhoCompras = new ArrayList<>();
    }

    /*  adicionarItem(String nome, double preco, int quantidade): Adiciona um item ao carrinho com o nome, preço e quantidade especificados.
        removerItem(String nome): Remove um item do carrinho com base no seu nome.
        calcularValorTotal(): Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
        exibirItens(): Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades. */

    public void adicionarItem (String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        carrinhoCompras.add(item);
    }

    public void removerItem (String nome){
        List<Item> itensRemover = new ArrayList<>();
        for (Item item : carrinhoCompras) {
            if (item.getNome().equalsIgnoreCase(nome)){
                itensRemover.add(item);
            }
        }
        carrinhoCompras.removeAll(itensRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : carrinhoCompras) {
            valorTotal = valorTotal + ( item.getPreco() * item.getQuantidade() );
        }
        return valorTotal;
    }

    public void exibirItens(){
        System.out.println(carrinhoCompras);
    }

}
