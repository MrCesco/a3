package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Dono;

public class RepoDono {
    private List<Dono> donos_cadastrados;

    public RepoDono() {
        donos_cadastrados = new ArrayList<Dono>();
    }
    
    public void dono_add(Dono perfil) {
        donos_cadastrados.add(perfil);
    }

    public void deletarDono(Dono dono) {
        donos_cadastrados.remove(dono);
    }

}