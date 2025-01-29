public class App {
	public static void main(String[] args) {
		
        Banco banco = new Banco();

        System.out.println(banco);

        Cliente cliente1 = new Cliente();
		cliente1.setNome("Joao Santos");
		
		Conta cc = new ContaCorrente(cliente1);
        banco.setContas(cc);
		Conta poupanca = new ContaPoupanca(cliente1);
        banco.setContas(poupanca);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
        banco.imprimirContas();
	}
}
