import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        System.out.println("Digite nome:");
        nomeCliente = scanner.next();
        System.out.println("Digite agência:");
        agencia = scanner.next();
        System.out.println("Digite número da conta:");
        numeroConta = scanner.nextInt();
        System.out.println("Digite saldo:");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + 
        ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
