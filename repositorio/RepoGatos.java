package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Gatos;

public class RepoGatos {
    private List<Gatos> gatos_cadastrados;

    public RepoGatos() {
        gatos_cadastrados = new ArrayList<Gatos>();
    }

    public void listagem_gatos() {
        System.out.println("Gatos disponíveis:");

        String nome, cor, raca, genero, dados_medicos;

        for (Gatos pet : gatos_cadastrados) {
            nome = pet.getNome();
            cor = pet.getCor();
            genero = pet.getGenero();
            raca = pet.getRaca();
            dados_medicos = pet.getFichaMedica().toString();

            System.out.printf(
                    "Pet " + pet.getId()
                            + "\nNome: %s\nCor: %s\nGênero: %s\nRaça: %s\nInformações médicas: %s\n",
                    nome, cor, genero, raca, dados_medicos);
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

    public List<Gatos> getGatos_cadastrados() {
        return gatos_cadastrados;
    }
}