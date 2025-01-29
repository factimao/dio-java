import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco (){
        this.nome = "Banco Digital";
        this.contas = new ArrayList<>();
    }

    public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(Conta conta) {
		this.contas.add(conta);
	}

    public void imprimirContas(){
        System.out.println("+++ " + this.nome + " - Listagem de Contas +++");
        for (Conta conta : contas) {
            System.out.println("Agência: " + conta.agencia + " | Número: " + conta.numero + " | Saldo: " + conta.saldo);
        }

    }

    @Override
    public String toString() {
        return "Banco [nome=" + nome + ", contas=" + contas + "]";
    }

    

}