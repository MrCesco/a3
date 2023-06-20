package view;

import java.util.Scanner;

import models.Adotante;

public class AdotanteView {
    public Adotante inserir_adotante(Scanner entrada) {

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

        System.out.println("CPF");
        documento = entrada.nextLine();

        Adotante a_info = new Adotante(nome, local_info, documento, email, telefone, tipo);

        System.out.println("Cadastro concluído");
        System.out.println("/////////////");
        System.out.println(a_info);

        return a_info;
    }
}
