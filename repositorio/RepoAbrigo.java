package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.Abrigo;

public class RepoAbrigo {
    private List<Abrigo> abrigos_cadastrados;

    public RepoAbrigo() {
        abrigos_cadastrados = new ArrayList<Abrigo>();
    }

    public void adicionar_abrigo(Abrigo perfil) {
        abrigos_cadastrados.add(perfil);
    }

    public void remover_abrigo(Abrigo perfil) {
        abrigos_cadastrados.remove(perfil);
    }

    public List<Abrigo> getAbrigos_cadastrados() {
        return abrigos_cadastrados;
    }
}
