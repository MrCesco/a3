package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Gatos;

public class RepoGatos {
    private List<Gatos> gatos_cadastrados;

    public RepoGatos() {
        gatos_cadastrados = new ArrayList<Gatos>();
    }

    public void deletarGatosById(int id) {
        Gatos g = null;
        for (Gatos g1 : gatos_cadastrados) {
            if (g1.getId() == id) {
                g = g1;
            }
        }
        try {
            gatos_cadastrados.remove(g);
        } catch (NullPointerException e) {
            System.out.println("Id " + id + " não encontrado");
        }
    }
}
