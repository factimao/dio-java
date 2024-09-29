import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Candidatura {
    public static void main(String[] args) {
        // selecaoCandidatos();
        //imprimirSelecionado();
        String [] candidatos = {"FELIPE", "MARCIA" , "JULIA" , "PAULO" , "AUGUSTO" };
        for (String candidato : candidatos) {
            entrarEmContato(candidato);
        }
    }
    
    static void entrarEmContato (String candidato){
        int tentativasRealizadas = 0;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
            atendeu = atender();
            tentativasRealizadas++;
            if(atendeu){
                continuarTentando = false;
                System.out.println("CONTATO REALIZADO COM SUCESSO");
            }
        }while(continuarTentando && tentativasRealizadas < 3);
        if(atendeu){
            System.out.println("CONSEGUIMOS CONTATO COM CANDIDATO " + candidato + " NA TENTATIVA NR. " + tentativasRealizadas);
        }else{
            System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato + ", NUMERO MÁXIMO DE TENTATIVAS " + tentativasRealizadas + " RELIZADAS.");
        }
    }

    static boolean atender() {
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionado() {
        String [] candidatos = {"FELIPE", "MARCIA" , "JULIA" , "PAULO" , "AUGUSTO" };
        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
        for(int indice=0;indice<candidatos.length;indice++){
            System.out.println("O candidadato de número " + (indice+1) + " é " + candidatos[indice]);
        }
        System.out.println("Forma abreviada");
        for (String string : candidatos) {
            System.out.println("O candidadato selecionado é " + string);
        }
    }
    
    static void selecaoCandidatos(){
        String [] candidatos = {"FELIPE", "MARCIA" , "JULIA" , "PAULO" , "AUGUSTO" , "MONICA" , "FABRICIO" , "MIRELA" , "DANIELA" , "JORGE"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase=2000.0;
        while (candidatosSelecionados<5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                candidatosSelecionados++;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            }
            candidatoAtual++;
        }
        System.out.println("Quantidade de candidatos selecionados: " + candidatosSelecionados);
    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase>salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO");
        }else if(salarioBase==salarioPretendido){
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRAPROPOSTA");
        }else{
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }

    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800 , 2200);
    }    
    
}
