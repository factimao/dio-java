package set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    
    Set <Convidado> convidadosSet;

    public ConjuntoConvidados() {
        this.convidadosSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadosSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        for (Convidado convidado : convidadosSet) {
            if(convidado.getCodigoConvite() == codigoConvite){
                convidadosSet.remove(convidado);
                break;
            }
        }
    }

    public int contarConvidados(){
        return this.convidadosSet.size();
    }
    
    public void exibirConvidados(){
        System.out.println("*** Lista de Convidados ***");
        System.out.println(this.convidadosSet);
    }


}
