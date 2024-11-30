package Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numeros = new ArrayList<Integer>();

    public SomaNumeros() {
       this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        numeros.add(numero);
    }

    public int calcularSoma(){
        int soma = 0;
        for (Integer n : numeros) {
            soma = soma + n;
        }
        return soma;
    }

    public int encontrarMaiorNumero(){
        int n = 0;
        for (Integer num : numeros) {
            if (num > n){
                n = num;
            }
        }
        return n;
    }

    public int encontrarMenorNumero(){
        int n = 2147483647;
        for (Integer num : numeros) {
            if (num < n){
                n = num;
            }
        }
        return n;
    }

    public void exibirNumeros(){
        System.out.println("---- Lista de Numeros ---");
        if(!numeros.isEmpty()){
            for (Integer integer : numeros) {
                System.out.println(integer);    
            }
        }
    }
    

}
