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

    public List<Ong> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}
