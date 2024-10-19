import OperacoesBasicas.CarrinhoCompras;
import OperacoesBasicas.ListaTarefas;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

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

        operacoesCarrinho();



    }

    public static void operacoesCarrinho(){
        CarrinhoCompras meuCarrinhoCompras = new CarrinhoCompras();
        System.out.println("Quantidade de tarefas: " + meuCarrinhoCompras.calcularValorTotal());

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
}
