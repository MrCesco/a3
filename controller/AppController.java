package controller;

import repositorio.RepoPessoa;
import view.AppView;
import view.PessoaView;

public class AppController {
    RepoPessoa repopessoa;
    AppView appview;
    
    public AppController() {
        repopessoa = new RepoPessoa();
        appview = new AppView(this);
    }

    public void iniciar() {
        appview.menuInicial();
    }

    public void opcaoMenuPrincipal(int op) {
        switch (op) {
            case 1:
                PessoaView.listarPessoas(repopessoa.getAllPessoas());
                iniciar();
                break;

            case 2:
                repopessoa.criarPessoaEIncluir();
                iniciar();
                break;
            case 3:

                //repopessoa.deletarPessoaById();
                break;

        }
    }
}
