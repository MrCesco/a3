package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Gatos;

public class RepoGatos {
    private List<Gatos> gatos_cadastrados;

    public RepoGatos() {
        gatos_cadastrados = new ArrayList<Gatos>();
    }

    public void listagem_caes() {
        String nome, cor, raca, genero;
        for (Gatos item : gatos_cadastrados) {
            nome = item.getNome();
            cor = item.getCor();
            genero = item.getGenero();
            raca = item.getRaca();

            System.out.printf("Gato:\nNome:%s\nCor:%s\nGênero:%s\nRaça:%s\n", nome, cor, genero, raca);
        }

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