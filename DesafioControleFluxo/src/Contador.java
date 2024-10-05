import java.util.Scanner;

public class Contador {
    /*public static void main(String[] args) {
        System.out.println(" ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número:");
        int numero2 = scanner.nextInt();
        try {
            contarNumeros(numero1, numero2);
        } catch (ParametrosInvalidosException e) {
            // e.printStackTrace();
            System.out.println("O segundo número deve ser maior que o primeiro");
        }

        }

        static void contarNumeros(int numero1, int numero2) throws ParametrosInvalidosException{
            if (numero1 >= numero2){
                throw new ParametrosInvalidosException();
            }
            for(int i=1;i<=(numero2-numero1);i++){
                System.out.println("Imprimindo o número "+i);
            }
        }


    }*/

    //import java.util.Scanner;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();
        
        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();
        
        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        String nomeCliente = partes[0];
        boolean contratado = false;
        
        for (String parte : partes) {
            if(servico.equals(parte)){
                contratado = true;
            }
        }
        
        if (contratado){
          System.out.println("Sim");
        }else{
          System.out.println("Nao");
        }
        
        scanner.close();
    }
}
