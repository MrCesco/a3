package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.Adotante;

public class RepoAdotante {
    private List<Adotante> adotantes_cadastrados;

    public RepoAdotante() {
        adotantes_cadastrados = new ArrayList<Adotante>();
    }

    public void listagem_adotantes() {
        String nome, cpf, endereco, cadastro;
        for (Adotante pessoa : adotantes_cadastrados) {
            nome = pessoa.getNome();
            cpf = pessoa.getCpf();
            endereco = pessoa.getEndereco();
            cadastro = pessoa.getTipo_cadastro();

            System.out.println("Perfil " + pessoa.getId() + "\nNome: " + nome + "\n" + "Doc: " + cpf + "\n" + "Endereço: " + endereco
                    + "\nTipo de cadastro: " + cadastro);
                    
            System.out.println("/////////////");

        }
    }

    public void deletarAdotanteById(int id) {
        Adotante a2 = null;
        for (Adotante item : adotantes_cadastrados) {
            if (item.getId() == id) {
                a2 = item;
            }
        }

        try {
            adotantes_cadastrados.remove(a2);
        } catch (NullPointerException e) {
            System.out.println("Id " + id + " não encontrado");
        }

        listagem_adotantes();
    }

    public List<Adotante> getAdotantes_cadastrados() {
        return adotantes_cadastrados;
    }
}