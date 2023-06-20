package view;

import java.util.Scanner;

import models.Admin;

public class AdminView {
    public static int validador_adm(Scanner entrada, Admin a1) {
        String senha;
        int op = 0;
        
        System.out.println("Por favor, digite sua senha de Administrador");
        senha = entrada.nextLine();
        
        if (senha.equals(a1.getCredencial_adm())) {
            System.out.print("Bem-vindo ao menu de administrador\n1- Listar ONGs\n2- Listar Adotantes\n3- Listar Donos\n4- Listar Cães\n5- Listar Gatos");
            op = entrada.nextInt();
        } else {
            System.out.println("Credencial inválida");
        }

        return op;
    }
}