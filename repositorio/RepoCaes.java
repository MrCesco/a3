package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Caes;

public class RepoCaes {
    private List<Caes> caes_cadastrados;

    public RepoCaes() {
        caes_cadastrados = new ArrayList<Caes>();
    }

    public void listagem_caes() {
        System.out.println("Cães disponíveis");

        String nome, cor, raca, genero, dados_medicos;
        for (Caes pet : caes_cadastrados) {
            nome = pet.getNome();
            cor = pet.getCor();
            genero = pet.getGenero();
            raca = pet.getRaca();
            dados_medicos = pet.getFichaMedica().toString();

            System.out.printf(
                    "Pet " + pet.getId()
                            + "\nNome: %s\nCor: %s\nGênero: %s\nRaça: %s\nDados médicos: %s\n",
                    nome, cor, genero, raca, dados_medicos);

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