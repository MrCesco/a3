package repositorio;

import java.util.ArrayList;
import java.util.List;
import models.Dono;

public class RepoDono {
    private List<Dono> donos_cadastrados;

    public RepoDono() {
        donos_cadastrados = new ArrayList<Dono>();
    }

    public void listagem_donos() {
        System.out.println("Donos cadastrados:");

        String nome, cpf, endereco, cadastro;
        for (Dono item : donos_cadastrados) {
            nome = item.getNome();
            cpf = item.getCpf();
            endereco = item.getEndereco();
            cadastro = item.getTipo_cadastro();

            System.out.println("Dono: " + nome + "\n" + "Doc: " + cpf + "\n" + "Endereço: " + endereco
                    + "\nTipo de cadastro:" + cadastro);

            System.out.println("/////////////");

        }
    }

    public List<Dono> getDonos_cadastrados() {
        return donos_cadastrados;
    }
}