package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.FichaMedica;
import models.Gatos;

public class RepoGatos {
    private List<Gatos> gatos_cadastrados;

    public RepoGatos() {
        gatos_cadastrados = new ArrayList<Gatos>();
    }

    public void listagem_gatos() {
        String nome, cor, raca, genero;
        FichaMedica dados_medicos;

        for (Gatos item : gatos_cadastrados) {
            nome = item.getNome();
            cor = item.getCor();
            genero = item.getGenero();
            raca = item.getRaca();
            dados_medicos = item.getFichaMedica();

            System.out.printf("Gato:\nNome:%s\nCor:%s\nGênero:%s\nRaça:%s\nInformações médicas:", nome, cor, genero, raca, dados_medicos);
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