package view;

import java.util.Scanner;

import models.Admin;

public class AdminView {
    public int validador_adm(Scanner entrada, Admin a1) {
        String senha;
        int op = 0;

        System.out.println("Por favor, digite sua senha de Administrador");
        senha = entrada.nextLine();

        if (senha.equals(a1.getCredencial_adm())) {
            System.out.print(
                    "Bem-vindo ao menu de administrador\n1- Listar ONGs\n2- Listar Adotantes\n3- Listar Donos\n4- Listar Cães\n5- Listar Gatos\n6- Deletar informações\n");
            op = entrada.nextInt();
        } else {
            System.out.println("Credencial inválida");
        }

        System.out.println("/////////////");

        return op;
    }

    public int[] remover_dados(Scanner entrada) {
        int[] op = new int[2];

        System.out.println(
                "Você entrou na área de remoção de cadastros, por favor, informe o tipo de cadastro que deseja deletar");
        System.out.print("1- ONGs\n2- Donos\n3- Adotantes\n4- Cães\n 5- Gatos\n");

        op[0] = entrada.nextInt();
        System.out.println("/////////////");

        return op;
    }
}