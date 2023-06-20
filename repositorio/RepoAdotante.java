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

            System.out.println("Adotante " + pessoa.getId() + "Nome: " + nome + "\n" + "Doc: " + cpf + "\n" + "Endereço: " + endereco
                    + "Tipo de cadastro:" + cadastro);
                    
            System.out.println("/////////////");

        }
    }

    public List<Adotante> getAdotantes_cadastrados() {
        return adotantes_cadastrados;
    }
}