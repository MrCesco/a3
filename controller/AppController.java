package controller;

import java.util.Scanner;
import models.Admin;
import models.Caes;
import models.FichaMedica;
import models.Gatos;
import models.Vacina;
import repositorio.RepoOng;
import repositorio.RepoAdotante;
import repositorio.RepoCaes;
import repositorio.RepoDono;
import repositorio.RepoGatos;
import view.AdminView;
import view.AdotanteView;
import view.AppView;
import view.CaesView;
import view.DonoView;
import view.GatosView;
import view.OngView;

public class AppController {
    RepoOng repo_ong;
    RepoAdotante repo_adotante;
    RepoDono repo_dono;
    RepoCaes repo_cao;
    RepoGatos repo_gato;
    Admin administrador;
    AppView app_view;
    AdotanteView adotante_view;
    DonoView dono_view;
    OngView ong_view;
    AdminView admin_view;
    CaesView caes_view;
    GatosView gato_view;

    public AppController() {
        repo_ong = new RepoOng();
        repo_adotante = new RepoAdotante();
        repo_dono = new RepoDono();
        repo_cao = new RepoCaes();
        repo_gato = new RepoGatos();
        administrador = new Admin();
        app_view = new AppView();
        adotante_view = new AdotanteView();
        dono_view = new DonoView();
        ong_view = new OngView();
        admin_view = new AdminView();
        caes_view = new CaesView();
        gato_view = new GatosView();

    }

    public void iniciar() {
        popular_repositorios();
        Scanner leitor = new Scanner(System.in);
        int selection = app_view.menu_principal(leitor);

        switch (selection) {
            case 1:
                repo_cao.listagem_caes();
                repo_gato.listagem_gatos();
                iniciar();
                break;
            case 2:
                repo_ong.getAbrigos_cadastrados().add(ong_view.inserir_ong(leitor));
                repo_cao.getCaes_cadastrados().add(caes_view.inserir_cao(leitor));
                repo_gato.getGatos_cadastrados().add(gato_view.cadastro_gato(leitor));
                iniciar();
                break;
            case 3:
                repo_dono.getDonos_cadastrados().add(dono_view.inserir_dono(leitor));
                repo_cao.getCaes_cadastrados().add(caes_view.inserir_cao(leitor));
                iniciar();

                break;
            case 4:
                repo_adotante.getAdotantes_cadastrados().add(adotante_view.inserir_adotante(leitor));
                iniciar();
                break;
            case 7:
                inciar_adm(leitor);
                break;
            default:
                System.out.println("Opção inválida");
                iniciar();
        }
    }

    public void popular_repositorios() {
        Vacina vacina1 = new Vacina("10/05/2022", "V10");
        Vacina vacina2 = new Vacina("02/03/2022", "V8");
        Vacina vacina3 = new Vacina("20/04/2022", "Vacina da Gripe Canína");
        Vacina vacina4 = new Vacina("14/11/2022", "V5");
        Vacina vacina5 = new Vacina("03/09/2021", "V3");

        FichaMedica f1 = new FichaMedica(true, vacina1);
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Spyke", "05/2016", "Marrom", "28kg", "Macho", "Boxer", f1, "Grande"));
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Poly", "02/2015", "Preto e branco", "16kg", "Fêmea", "Border Collie", f1, "Grande"));

        FichaMedica f2 = new FichaMedica(false, vacina2);
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Bolinha", "04/2019", "Branco", "8kg", "Fêmea", "SRD", f2, "Pequeno"));
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Duncan", "06/2010", "Caramelo", "12kg", "Macho", "Beagle", f1, "Grande"));

        FichaMedica f3 = new FichaMedica(true, vacina3);
        repo_cao.getCaes_cadastrados().add(new Caes("Mali", "01/2017", "Caramelo e preto", "50kg", "Macho",
                "Pastor Belga Malinois", f3, "Grande"));

        FichaMedica f4 = new FichaMedica(true, vacina4);
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Fifi", "10/2022", "Preto e branco", "4kg", "Fêmea", "SRD", f4, false));
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Jurandira", "03/2020", "Preto e branco", "5kg", "Fêmea", "SRD", f4, false));
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Gaia", "07/2019", "Creme", "4kg", "Fêmea", "Siamês", f4, false));

        FichaMedica f5 = new FichaMedica(true, vacina5);
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Amendoim", "04/2013", "Laranja e branco", "5kg", "Macho", "SRD", f5, false));
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Marie", "07/2011", "Branco", "6kg", "Fêmea", "SRD", f5, false));
    }

    public void inciar_adm(Scanner entrada) {
        int op = admin_view.validador_adm(entrada, administrador);

        switch (op) {
            case 1:
                repo_ong.listagem_ong();
                break;
            case 2:
                repo_adotante.listagem_adotantes();
                break;
            case 3:
                repo_dono.listagem_donos();
                break;
            case 4:
                repo_cao.listagem_caes();
                break;
            case 5:
                repo_gato.listagem_gatos();
                break;
        }
    }
}