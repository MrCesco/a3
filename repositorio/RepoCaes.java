package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Caes;

public class RepoCaes {
    private List<Caes> caes_cadastrados;

    public RepoCaes() {
        caes_cadastrados = new ArrayList<Caes>();
    }

    public void deletarCaesById(int id) {
        Caes c = null;
        for (Caes c1 : caes_cadastrados) {
            if (c1.getId() == id) {
                c = c1;
            }
        }
        try {
            caes_cadastrados.remove(c);
        } catch (NullPointerException e) {
            System.out.println("Id " + id + " não encontrado");
        }
    }
}
