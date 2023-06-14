package controller;

import java.util.Scanner;

import repositorio.RepoAbrigo;
import repositorio.RepoAdotante;
import view.AppView;

public class AppController {
    RepoAbrigo abrigo_list;
    RepoAdotante adotante_list;
    AppView appview;
    
    public AppController() {
        abrigo_list = new RepoAbrigo();
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

    public RepoAbrigo getAbrigo_list() {
        return abrigo_list;
    }

    public RepoAdotante getAdotante_list() {
        return adotante_list;
    }
}
