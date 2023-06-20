package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Caes;
import models.FichaMedica;

public class RepoCaes {
    private List<Caes> caes_cadastrados;

    public RepoCaes() {
        caes_cadastrados = new ArrayList<Caes>();
    }

    public void listagem_caes() {
        String nome, cor, raca, genero;
        FichaMedica dados_medicos;
        for (Caes item : caes_cadastrados) {
            nome = item.getNome();
            cor = item.getCor();
            genero = item.getGenero();
            raca = item.getRaca();
            dados_medicos = item.getFichaMedica();

            System.out.printf("Cachorro:\nNome:%s\nCor:%s\nGênero:%s\nRaça:%s\nDados médicos:\n", nome, cor, genero, raca, dados_medicos);
        }

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

    public List<Caes> getCaes_cadastrados() {
        return caes_cadastrados;
    }
}