package view;

import java.util.Scanner;

import controller.AppController;

public class AppView {
    private AppController controller;

    public AppView(AppController controller) {
        this.controller = controller;
    }

    public void menuInicial() {
        int retorno = -1;
        System.out.println("1. Listar pessoas");
        System.out.println("2. Incluir pessoa");
        System.out.println("3. Deletar pessoa");
        System.out.println("");
        System.out.println("Escolha sua opção");
        Scanner scan = new Scanner(System.in);
        retorno = scan.nextInt();
        scan.close();

        controller.opcaoMenuPrincipal(retorno);
    }
}
