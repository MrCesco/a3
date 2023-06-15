package view;

import java.util.Scanner;

import controller.AppController;
import models.Abrigo;
import models.Adotante;
import models.Dono;

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

    public void cadastro_adotante(Scanner entrada) {

        System.out.println("Você entrou na área de cadastro para adotar um pet, informe seus dados");

        String nome, local_info, email, telefone, documento;
        String tipo = "Adotante";

        System.out.println("Nome:");
        nome = entrada.nextLine();

        System.out.println("Endereço:");
        local_info = entrada.nextLine();

        System.out.println("Endereço de e-mail:");
        email = entrada.nextLine();

        System.out.println("Telefone:");
        telefone = entrada.nextLine();

        System.out.println("Documento(RG ou CPF):");
        documento = entrada.nextLine();

        Adotante a_info = new Adotante(nome, local_info, documento, email, telefone, tipo);

        controller.getAdotante_list().adicionar_adotante(a_info);

        System.out.println("Cadastro concluído");
        System.out.println(a_info);

    }

    public void cadastro_abrigo(Scanner entrada) {
        String nome, local_info, email, telefone, documento, nome_abrigo, cnpj;

        System.out.println("Nome do representante do abrigo de animais:");
        nome = entrada.nextLine();

        System.out.println("Documento do representante(RG ou CPF):");
        documento = entrada.nextLine();

        System.out.println("Nome do abrigo");
        nome_abrigo = entrada.nextLine();

        System.out.println("Endereço do abrigo:");
        local_info = entrada.nextLine();

        System.out.println("CNPJ do abrigo:");
        cnpj = entrada.nextLine();

        System.out.println("Endereço de e-mail:");
        email = entrada.nextLine();

        System.out.println("Telefone do abrigo:");
        telefone = entrada.nextLine();

        Abrigo ab_info = new Abrigo(nome, local_info, documento, email, telefone, cnpj, nome_abrigo);

        controller.getAbrigo_list().adicionar_abrigo(ab_info);

        System.out.println("Cadastro concluído");
        System.out.println(ab_info);
    }

    public void cadastro_dono(Scanner entrada) {
        String nome, local_info, email, telefone, documento;
        String tipo = "Dono";

        System.out.println("Nome:");
        nome = entrada.nextLine();

        System.out.println("Endereço:");
        local_info = entrada.nextLine();

        System.out.println("Endereço de e-mail:");
        email = entrada.nextLine();

        System.out.println("Telefone:");
        telefone = entrada.nextLine();

        System.out.println("Documento(RG ou CPF):");
        documento = entrada.nextLine();

        Dono d_info = new Dono(nome, local_info, documento, email, telefone, tipo);

        System.out.println(d_info);
        System.out.println("Cadastro concluído");
    }
}
