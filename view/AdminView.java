package view;

import java.util.Scanner;
import models.Admin;
import repositorio.RepoAdotante;
import repositorio.RepoCaes;
import repositorio.RepoDono;
import repositorio.RepoGatos;
import repositorio.RepoOng;

public class AdminView {
    public boolean validador_adm(Scanner entrada, Admin a1) {
        String senha;
        boolean credencial_valida = false;

        System.out.println("Por favor, digite sua senha de Administrador");
        senha = entrada.nextLine();

        if (senha.equals(a1.getCredencial_adm())) {
            credencial_valida = true;
        } else {
            System.out.println("Credencial inválida");
        }
        System.out.println("/////////////");

        return credencial_valida;
    }

    public int menu_adm(Scanner entrada) {
        int op;
        System.out.println(
                "Bem-vindo ao menu de administrador\n1- Listar ONGs\n2- Listar Adotantes\n3- Listar Donos\n4- Listar Cães\n5- Listar Gatos\n6- Deletar informações\n");

        op = entrada.nextInt();

        System.out.println("/////////////");

        entrada.nextLine();

        return op;
    }

    public int[] remover_dados(Scanner entrada, RepoOng cadastros_abrigo, RepoDono cadastros_dono,
            RepoAdotante cadastros_adotante, RepoCaes cadastros_caes, RepoGatos cadastros_gatos) {
        int[] op = new int[2];

        System.out.println(
                "Você entrou na área de remoção de cadastros, por favor, informe o tipo de cadastro que deseja deletar");
        System.out.print("1- ONGs\n2- Donos\n3- Adotantes\n4- Cães\n5- Gatos\n");

        op[0] = entrada.nextInt();

        if (op[0] == 1) {
            cadastros_abrigo.listagem_ong();
        } else if (op[0] == 2) {
            cadastros_dono.listagem_donos();
        } else if (op[0] == 3) {
            cadastros_adotante.listagem_adotantes();
        } else if (op[0] == 4) {
            cadastros_caes.listagem_caes();
        } else if (op[0] == 5) {
            cadastros_gatos.listagem_gatos();
        } else {
            remover_dados(entrada, cadastros_abrigo, cadastros_dono, cadastros_adotante, cadastros_caes,
                    cadastros_gatos);
        }

        System.out.println("Digite o id do cadastro que gostaria de remover");
        op[1] = entrada.nextInt();

        System.out.println("/////////////");

        entrada.nextLine();

        return op;
    }
}