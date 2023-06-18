package controller;

import java.util.Scanner;
import models.Admin;
import repositorio.RepoOng;
import repositorio.RepoAdotante;
import repositorio.RepoDono;
import view.AppView;

public class AppController {
    RepoOng ong_list;
    RepoAdotante adotante_list;
    RepoDono dono_list;
    AppView appview;
    Admin administrador;

    public AppController() {
        ong_list = new RepoOng();
        adotante_list = new RepoAdotante();
        dono_list = new RepoDono();
        appview = new AppView(this);
        administrador = new Admin();
    }

    public void iniciar() {
        Scanner leitor = new Scanner(System.in);
        int selection = appview.menu_principal(leitor);

        switch (selection) {
            case 1:
                appview.adotante_info();
                appview.adm_info();
                break;
            case 2:
                appview.ong_info();
                break;
            case 3:
                appview.dono_info();
                break;
            case 4:
                appview.adm_info();
                break;
        }
    }

    public RepoOng getOng_list() {
        return ong_list;
    }

    public RepoAdotante getAdotante_list() {
        return adotante_list;
    }

    public RepoDono getDono_list() {
        return dono_list;
    }

    public Admin getAdministrador() {
        return administrador;
    }
}