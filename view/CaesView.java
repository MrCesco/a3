package view;

import java.util.Scanner;

import models.Caes;
import models.FichaMedica;
import models.Vacina;

public class CaesView {
    public static Caes inserir_cao(Scanner entrada) {
        System.out.println("Você entrou na área de cadastro para adotar um pet, informe seus dados");

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

        String nome_vacina, data_aplicacao, nome_medicamento, data_medicamento;
        int op;
        boolean castrado = false;

        System.out.println("Qual é o nome da vacina mais recente que seu pet tomou?");
        nome_vacina = entrada.nextLine();

        System.out.println("Data de aplicação:");
        data_aplicacao = entrada.nextLine();

        Vacina v_info = new Vacina(data_aplicacao, nome_vacina);

        System.out.println("Qual é o nome do medicamento que seu pet toma ou costumava tomar?");
        nome_medicamento = entrada.nextLine();

        System.out.println("Data da última dose:");
        data_medicamento = entrada.nextLine();

        System.out.println("Seu pet é castrado? (1- Sim  ou 2- Não)");
        op = entrada.nextInt();

        if (op == 1) {
            castrado = true;
        }

        FichaMedica f_info = new FichaMedica(castrado, v_info);

        Caes c_info = new Caes(nome, data, cor, peso, genero, raca, f_info, porte);

        System.out.println("Cadastro concluído");

        return c_info;
    }
}