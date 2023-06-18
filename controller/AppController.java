package controller;

import java.util.Scanner;
import models.Admin;
import repositorio.RepoOng;
import repositorio.RepoAdotante;
import repositorio.RepoCaes;
import repositorio.RepoDono;
import repositorio.RepoGatos;
import view.AppView;

public class AppController {
    RepoOng repo_ong;
    RepoAdotante repo_adotante;
    RepoDono repo_dono;
    RepoCaes repo_cao;
    RepoGatos repo_gato;
    Admin administrador;
    AppView appview;

    public AppController() {
        repo_ong = new RepoOng();
        repo_adotante = new RepoAdotante();
        repo_dono = new RepoDono();
        repo_cao = new RepoCaes();
        repo_gato = new RepoGatos();
        administrador = new Admin();
        appview = new AppView(this);
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

    public RepoOng getRepo_ong() {
        return repo_ong;
    }

    public RepoAdotante getRepo_adotante() {
        return repo_adotante;
    }

    public RepoDono getRepo_dono() {
        return repo_dono;
    }

    public RepoCaes getRepo_cao() {
        return repo_cao;
    }

    public RepoGatos getRepo_gato() {
        return repo_gato;
    }

    public Admin getAdministrador() {
        return administrador;
    }
}