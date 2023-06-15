package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.ONG;

public class RepoONG {
    private List<ONG> abrigos_cadastrados;

    public RepoONG() {
        abrigos_cadastrados = new ArrayList<ONG>();
    }

    public void adicionar_abrigo(ONG perfil) {
        abrigos_cadastrados.add(perfil);
    }

    public void remover_abrigo(ONG perfil) {
        abrigos_cadastrados.remove(perfil);
    }

    public List<ONG> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}
