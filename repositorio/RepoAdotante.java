package repositorio;

import java.util.ArrayList;
import java.util.List;

import models.Adotante;

public class RepoAdotante {
    private List<Adotante> adotantes_cadastrados;

    public RepoAdotante() {
        adotantes_cadastrados = new ArrayList<Adotante>();
    }

    public void listagem_adotantes(){
        String nome, cpf, endereco, cadastro;
        for (Adotante item : adotantes_cadastrados) {
            nome = item.getNome();
            cpf = item.getCpf();
            endereco = item.getEndereco();
            cadastro = item.getTipo_cadastro();

            System.out.println("Adotante: " + nome + "\n" + "Doc: " + cpf + "\n" + "Endereço: " + endereco + "Tipo de cadastro:" + cadastro);
        } 
    }

    public List<Adotante> getAdotantes_cadastrados() {
        return adotantes_cadastrados;
    }
}