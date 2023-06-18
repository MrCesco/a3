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
                "Menu de Administrador:\n1- Listar todos os adotantes\n2- Listar todas as ONGs\n3- Listar todos os donos de pet\n4- Listar todos os pets");
        op = entrada.nextInt();

        return op;
    }
}
