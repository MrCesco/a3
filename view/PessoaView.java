package view;

import java.util.List;
import models.Pessoa;

public class PessoaView {
    public static void listarTurmas(List<Pessoa> pessoas) {
        for( Pessoa t : pessoas) {
            System.out.println(t.getNome() +" - "+t.getTipo_cadastro());
        }
    }
}
