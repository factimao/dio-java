import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
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


    }
