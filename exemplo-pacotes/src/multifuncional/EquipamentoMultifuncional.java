package multifuncional;

import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Impressora;
import equipamentos.copiadora.Copiadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void imprimir() {
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL!");
    }

    public void digitalizar() {
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL!");
    }

    public void copiar() {
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL!");
    }
    
}
