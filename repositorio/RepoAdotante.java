package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.Adotante;

public class RepoAdotante {
    private List<Adotante> adotantes_cadastrados;

    public RepoAdotante() {
        adotantes_cadastrados = new ArrayList<Adotante>();
    }

    public void a_add(Adotante perfil) {
        adotantes_cadastrados.add(perfil);
    }
}
