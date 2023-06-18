package view;

import java.util.Scanner;

import models.Admin;

public class AdminView {
    public static void menu_adm(Scanner entrada, Admin a1) {
        int op;
        String senha;
        System.out.println("Por favor, digite sua senha de Administrador");
        senha = entrada.nextLine();
    }
}
