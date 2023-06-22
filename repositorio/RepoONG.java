package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Ong;

public class RepoOng {
    private List<Ong> abrigos_cadastrados;

    public RepoOng() {
        abrigos_cadastrados = new ArrayList<Ong>();
    }

    public void listagem_ong() {
        String nome_representante, nome_ong, cnpj_ong;
        for (Ong item : abrigos_cadastrados) {
            nome_representante = item.getNome();
            nome_ong = item.getR_social();
            cnpj_ong = item.getCnpj();

            System.out.println("ONG " + item.getId() + "\n" + nome_ong + "\n" + "Representante: " + nome_representante
                    + "\n" + "CNPJ: " + cnpj_ong);
        }
    }

    public void deletarOngById(int id) {
        Ong abrigo = null;
        for (Ong item : abrigos_cadastrados) {
            if (item.getId() == id) {
                abrigo = item;
            }
        }

        try {
            abrigos_cadastrados.remove(abrigo);
        } catch (NullPointerException e) {
            System.out.println("Id " + id + " não encontrado");
        }

        listagem_ong();
    }

    public List<Ong> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}