package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.Ong;

public class RepoOng {
    private List<Ong> abrigos_cadastrados;

    public RepoOng() {
        abrigos_cadastrados = new ArrayList<Ong>();
    }

    public void ong_add(Ong perfil) {
        abrigos_cadastrados.add(perfil);
    }

    public void remover_abrigo(Ong perfil) {
        abrigos_cadastrados.remove(perfil);
    }



    public void listagem_ong(){
        String nome_representante, nome_ong, cnpj_ong;
        for (Ong item : abrigos_cadastrados) {
            nome_representante = item.getNome();
            nome_ong = item.getR_social();
            cnpj_ong = item.getCnpj();

            System.out.println("ONG: " + nome_ong + "\n" + "Representante: " + nome_representante + "\n" + "CNPJ: " + cnpj_ong);
        } 
    }


    public List<Ong> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}
