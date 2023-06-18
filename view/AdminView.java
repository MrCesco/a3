package view;

import java.util.Scanner;

public class AdminView {
    public static String login_adm(Scanner entrada) {
        String senha;
        System.out.println("Por favor, digite sua senha de Administrador");
        senha = entrada.nextLine();

        return senha;
    }

    public static int menu_adm(Scanner entrada) {
        int op;

        System.out.print(
                "Menu de Administrador:\n1- Listar todas as ONGs\n2- Listar todos os adotantes\n3- Listar todos os donos de pet\n4- Listar todos os pets\n");
        op = entrada.nextInt();

        return op;
    }
}
