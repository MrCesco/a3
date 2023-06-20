package view;

import java.util.Scanner;

public class AppView {
    public int menu_principal(Scanner entrada) {
        int op;

        System.out.println("Bem-vindo ao nosso APP, digite a opção desejada");
        System.out.print(
                "1- Ver animais\n2- Entrar como representante de ONG\n3- Entrar como dono de pet\n4- Adotar\n");
        
        System.out.println("/////////////");
        op = entrada.nextInt();
        entrada.nextLine();
        
        return op;
    }
}