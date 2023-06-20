package view;

import java.util.Scanner;

import models.Dono;

public class DonoView {
    public Dono inserir_dono(Scanner entrada) {
        System.out.println("Você entrou na área de cadastro de dono, informe seus dados");

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

        System.out.println("CPF");
        documento = entrada.nextLine();

        Dono d_info = new Dono(nome, local_info, documento, email, telefone, tipo);

        System.out.println("Cadastro concluído");
        System.out.println("/////////////");

        System.out.println(d_info);

        return d_info;
    }
}
