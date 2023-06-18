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

    public void adm_info() {
        Scanner leitor = new Scanner(System.in);
        int op = AdminView.validador_adm(leitor, controller.getAdministrador());

        if (op == 1) {
            controller.getOng_list().listagem_ong();
        } else if (op == 2) {
            controller.getAdotante_list().listagem_adotantes();
        } else if (op == 3) {
            controller.getDono_list().listagem_donos();
        } else {
            System.out.println("Opção inválida");
        }
    }
}