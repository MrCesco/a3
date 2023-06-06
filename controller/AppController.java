package controller;

import java.util.List;
import DAO.PessoaDAO;
import models.*;
import view.AppView;
import view.TurmaView;

public class AppController {
    private List<Pessoa> turmas;

    public AppController() {
        turmas = PessoaDAO.getTurmas();
    }

    public void iniciar() {
        int op = -1;
        do {
            op = AppView.menuInicial();
            switch (op) {
                case 1:
                    TurmaView.listarTurmas(turmas);
                    break;

                case 2:
                    criarTurmaEIncluir();
                    break;
    
            }
        } while(op > 0);
    }

    public void criarTurmaEIncluir() {
        Turma t = new Turma(0, "Nova", 30, 1);
        PessoaDAO.salvarTurma(t);
    }
}
