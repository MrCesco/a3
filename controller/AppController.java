package controller;

import java.util.List;
import DAO.PessoaDAO;
import models.*;
import view.AppView;
import view.PessoaView;

public class AppController {
    private List<Pessoa> pessoas;

    public AppController() {
        pessoas = PessoaDAO.getPessoas();
    }

    public void iniciar() {
        int op = -1;
        do {
            op = AppView.menuInicial();
            switch (op) {
                case 1:
                    PessoaView.listarTurmas(pessoas);
                    break;

                case 2:
                    criarPessoaEIncluir();
                    break;
    
            }
        } while(op > 0);
    }

    public void criarPessoaEIncluir() {
        Pessoa p = new Pessoa("joaozinho", "rua tal 123", "1234", "asihudhiaus@gmail.com", "123123", "ong");
        PessoaDAO.salvarPessoa(p);
    }
}
