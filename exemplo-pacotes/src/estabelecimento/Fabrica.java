package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) throws Exception {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();
        Impressora impressora = new EquipamentoMultifuncional();
        Digitalizadora digitalizadora = new EquipamentoMultifuncional();
        Copiadora copiadora = new EquipamentoMultifuncional();

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

        //em.copiar();
        //em.digitalizar();
        //em.imprimir();

        Deskjet dj = new Deskjet();
        dj.imprimir();

    }
}
