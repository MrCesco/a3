package controller;

import java.util.Scanner;

import repositorio.RepoONG;
import repositorio.RepoAdotante;
import view.AppView;

public class AppController {
    RepoONG ong_list;
    RepoAdotante adotante_list;
    AppView appview;
    
    public AppController() {
        ong_list = new RepoONG();
        adotante_list = new RepoAdotante();
        appview = new AppView(this);
    }

    public void iniciar() {
        Scanner leitor = new Scanner(System.in);
        int selection = appview.menu_principal(leitor);

        switch (selection) {
            case 1:
                appview.cadastro_adotante(leitor);
            break;
            case 2: 
                appview.cadastro_abrigo(leitor);
            break;
            case 3:
                appview.cadastro_dono(leitor);
            break;
        }
    }

    public RepoONG getOng_list() {
        return ong_list;
    }

    public RepoAdotante getAdotante_list() {
        return adotante_list;
    }
}