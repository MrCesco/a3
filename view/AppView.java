package view;
import java.util.Scanner;

public class AppView {
    public static int menuInicial() {
        int retorno = -1;
        System.out.println("1. Listar turmas");
        System.out.println("2. Incluir turma");
        System.out.println("");
        System.out.println("Escolha sua opção");
        try (Scanner scan = new Scanner(System.in)) {
            retorno = scan.nextInt();
        }
        return retorno;
    }
}
