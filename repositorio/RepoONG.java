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



    public int listagem_ong(){
        int r = abrigos_cadastrados.size();
        return r;
    }


    public List<Ong> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}
