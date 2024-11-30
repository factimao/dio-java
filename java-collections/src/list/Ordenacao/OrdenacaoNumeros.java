package Ordenacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class OrdenacaoNumeros {
    private List<Integer> numeros;

    public OrdenacaoNumeros() {
        this.numeros = new ArrayList<>();
    }
    
    public void adicionarNumeros(int n){
        this.numeros.add(n);
    }
    
    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(numeros);
        Collections.sort(listaAscendente);
        return listaAscendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaAscendente = new ArrayList<>(numeros);
        Collections.sort(listaAscendente);
        Collections.reverse(listaAscendente);
        return listaAscendente;
    }

}
