package view;

import java.util.Scanner;

import models.ONG;

public class OngView {
    public static ONG inserir_ong(Scanner entrada) {
        String nome, local_info, email, telefone, documento, nome_abrigo, cnpj;

        System.out.println("Nome do representante do abrigo de animais:");
        nome = entrada.nextLine();

        System.out.println("CPF do representante");
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

        ONG ab_info = new ONG(nome, local_info, documento, email, telefone, cnpj, nome_abrigo);

        System.out.println("Cadastro concluído");
        System.out.println(ab_info);

        return ab_info;
    }
}