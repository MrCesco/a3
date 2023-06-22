package view;

import java.util.Scanner;

import models.Caes;
import models.FichaMedica;
import models.Pessoa;
import models.Vacina;

public class CaesView {
    public Caes inserir_cao(Scanner entrada, Pessoa responsavel) {
        System.out.println("Você entrou na área de cadastro de cães, informe os dados do seu pet");

        String nome, data, cor, peso, genero, raca, porte;

        System.out.println("Nome do seu pet:");
        nome = entrada.nextLine();

        System.out.println("Informe a data de nascimento do seu pet:");
        data = entrada.nextLine();

        System.out.println("Cor:");
        cor = entrada.nextLine();

        System.out.println("Peso:");
        peso = entrada.nextLine();

        System.out.println("Gênero:");
        genero = entrada.nextLine();

        System.out.println("Raça:");
        raca = entrada.nextLine();

        System.out.println("Porte do seu pet:");
        porte = entrada.nextLine();

        System.out.println("Por favor, informe os dados médicos do seu pet");

        String nome_vacina, data_aplicacao;
        int op;
        boolean castrado = false;

        System.out.println("Qual é o nome da vacina mais recente que seu pet tomou?");
        nome_vacina = entrada.nextLine();

        System.out.println("Data de aplicação:");
        data_aplicacao = entrada.nextLine();

        Vacina v_info = new Vacina(data_aplicacao, nome_vacina);

        System.out.println("Seu pet é castrado? (1- Sim  ou 2- Não)");
        op = entrada.nextInt();

        if (op == 1) {
            castrado = true;
        }

        FichaMedica f_info = new FichaMedica(castrado, v_info);

        Caes c_info = new Caes(nome, data, cor, peso, genero, raca, f_info, responsavel, porte);

        System.out.println("Cadastro concluído");
        System.out.println("/////////////");
        entrada.nextLine();

        return c_info;
    }
}