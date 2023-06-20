package view;

import java.util.Scanner;
import models.FichaMedica;
import models.Gatos;
import models.Vacina;

public class GatosView {
    public static Gatos cadastro_gato(Scanner entrada) {
        System.out.println("Você entrou na área de cadastro para adotar um pet, informe seus dados");

        String nome, data, cor, peso, genero, raca;

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

        System.out.println("Por favor, informe os dados médicos do seu pet");

        String nome_vacina, data_aplicacao;
        int op;
        boolean teste = false;

        System.out.println("Qual é o nome da vacina mais recente que seu pet tomou?");
        nome_vacina = entrada.nextLine();

        System.out.println("Data de aplicação:");
        data_aplicacao = entrada.nextLine();

        Vacina v_info = new Vacina(data_aplicacao, nome_vacina);
        
        System.out.println("Seu pet testou positivo para FIV ou FELV? (1- Sim  ou 2- Não)");
        op = entrada.nextInt();

        if (op == 1) {
            teste = true;
        }

        FichaMedica f_info = new FichaMedica(teste, v_info);

       Gatos g_info = new Gatos(nome, data, cor, peso, genero, raca, f_info, teste);

        System.out.println("Cadastro concluído");

        return g_info;
    }
}
