package view;

import java.util.Scanner;

import models.Adotante;
import repositorio.RepoCaes;
import repositorio.RepoGatos;

public class AdotanteView {
    public Adotante inserir_adotante(Scanner entrada) {

        System.out.println("Você entrou na área de cadastro para adotar um pet, informe seus dados");

        String nome, local_info, email, telefone, documento;
        String tipo = "Adotante";

        System.out.println("Nome:");
        nome = entrada.nextLine();

        System.out.println("Endereço:");
        local_info = entrada.nextLine();

        System.out.println("Endereço de e-mail:");
        email = entrada.nextLine();

        System.out.println("Telefone:");
        telefone = entrada.nextLine();

        System.out.println("CPF");
        documento = entrada.nextLine();

        Adotante a_info = new Adotante(nome, local_info, documento, email, telefone, tipo);

        System.out.println("Cadastro concluído");
        System.out.println("/////////////");
        System.out.println(a_info);

        return a_info;
    }

    public void iniciar_adoção(Scanner entrada, RepoCaes cadastros_caes, RepoGatos cadastros_gatos) {
        int op;
        System.out.println("Qual animal você gostaria de adotar?\n1- Cachorro\n2- Gato");
        op = entrada.nextInt();

        if (op == 1) {
            cadastros_caes.listagem_caes();
            System.out.println("Selecione o id do seu novo melhor amigo(a)");
            op = entrada.nextInt();

            System.out.println("Você sinalizou interesse nesse pet, uma visita será marcada");
            cadastros_caes.deletarCaesById(op);
        } else if (op == 2) {
            cadastros_gatos.listagem_gatos();
            System.out.println("Selecione o id do seu novo melhor amigo(a)");
            op = entrada.nextInt();

            System.out.println("Você sinalizou interesse nesse pet, uma visita será marcada");
            cadastros_gatos.listagem_gatos();
        }
    }
}
