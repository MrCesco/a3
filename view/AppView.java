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
        System.out.print("Inicializando o programa, por favor, escolha o tipo de acesso:\n1- Cliente\n2- ADM\n");
        op = entrada.nextInt();

        if (op == 1) {
            System.out.println("Bem-vindo ao nosso APP, digite a opção desejada");
            System.out.print(
                    "1- Entrar como adotante\n2- Entrar como representante de ONG\n3- Entrar como dono de pet\n");
            op = entrada.nextInt();
        } else {
            System.out.println("Acesso como Administrador solicitado");
            op = 4;
        }
        entrada.nextLine();
        return op;
    }

    public void adotante_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getRepo_adotante().getAdotantes_cadastrados().add(AdotanteView.inserir_adotante(leitor));
    }

    public void ong_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getRepo_ong().getAbrigos_cadastrados().add(OngView.inserir_ong(leitor));

    }

    public void dono_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getRepo_dono().getDonos_cadastrados().add(DonoView.inserir_dono(leitor));

    }

    public void cao_info() {
        Scanner leitor = new Scanner(System.in);
        controller.getRepo_cao().getCaes_cadastrados().add(CaesView.inserir_cao(leitor));
    }

    public void adm_info() {
        Scanner leitor = new Scanner(System.in);
        int op = AdminView.validador_adm(leitor, controller.getAdministrador());

        if (op == 1) {
            controller.getRepo_ong().listagem_ong();
        } else if (op == 2) {
            controller.getRepo_adotante().listagem_adotantes();
        } else if (op == 3) {
            controller.getRepo_dono().listagem_donos();
        } else {
            System.out.println("Opção inválida");
        }
    }
}