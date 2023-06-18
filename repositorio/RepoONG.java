package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.ONG;

public class RepoONG {
    private List<ONG> abrigos_cadastrados;

    public RepoONG() {
        abrigos_cadastrados = new ArrayList<ONG>();
    }

    public void ong_add(ONG perfil) {
        abrigos_cadastrados.add(perfil);
    }

    public void remover_abrigo(ONG perfil) {
        abrigos_cadastrados.remove(perfil);
    }

    public int listagem_ong(){
        int r = abrigos_cadastrados.size();
        return r;
    }

    public List<ONG> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}
