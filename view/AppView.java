package view;

import java.util.Scanner;

import controller.AppController;

public class AppView {
    private AppController controller;

    public AppView(AppController controller) {
        this.controller = controller;
    }

    public int menu_principal(Scanner entrada) {
        int op;

        System.out.println("Bem-vindo ao nosso APP, digite a opção desejada");
        System.out.print("1- Entrar como adotante\n2- Entrar como representante de ONG\n3- Entrar como dono de pet\n");

        op = entrada.nextInt();
        entrada.nextLine();

        return op;
    }

    public void adotante_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getAdotante_list().a_add(AdotanteView.inserir_adotante(leitor));
    }

    public void ong_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getOng_list().ong_add(OngView.inserir_ong(leitor));

    }

    public void dono_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getDono_list().dono_add(DonoView.inserir_dono(leitor));

    }
}