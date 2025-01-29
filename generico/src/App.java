import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,10,11,12);
        // numeros.forEach(n -> {if(n%2==0){System.out.println(n);} });

        List<String> listaS = Stream.generate(() -> "Saudações a quem tem coragem")
            .limit(5)    
            .toList();

        listaS.forEach(System.out::println);

        List<String> palavras = Arrays.asList("java", "kotlin", "python", "cobol", "c", "c#");

        palavras.stream().filter(palavra -> palavra.length()>3).
        
        forEach(System.out::println);

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        
        int resultado = numeros.stream().reduce(0, Integer::sum);
        System.out.println(resultado);
        





    }





}
