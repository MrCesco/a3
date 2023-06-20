package view;

import java.util.Scanner;

import models.Ong;

public class OngView {
    public Ong inserir_ong(Scanner entrada) {
        String nome, endereco, email, telefone, cnpj, r_social;

        System.out.println("Nome do representante: ");
        nome = entrada.nextLine();

        System.out.println("Nome do abrigo: ");
        r_social = entrada.nextLine();

        System.out.println("Endereço do abrigo: ");
        endereco = entrada.nextLine();

        System.out.println("CNPJ do abrigo: ");
        cnpj = entrada.nextLine();

        System.out.println("Telefone do abrigo: ");
        telefone = entrada.nextLine();

        System.out.println("Endereço de e-mail: ");
        email = entrada.nextLine();

        Ong ong_info = new Ong(nome, endereco, email, telefone, cnpj, r_social);

        System.out.println("Cadastro concluído");
        System.out.println("/////////////");

        System.out.println(ong_info);

        return ong_info;
    }
}