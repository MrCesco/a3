package controller;

import java.util.Scanner;
import models.Admin;
import models.Caes;
import models.Dono;
import models.FichaMedica;
import models.Gatos;
import models.Ong;
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
    private RepoOng repo_ong;
    private RepoAdotante repo_adotante;
    private RepoDono repo_dono;
    private RepoCaes repo_cao;
    private RepoGatos repo_gato;
    private Admin administrador;
    private AppView app_view;
    private AdotanteView adotante_view;
    private DonoView dono_view;
    private OngView ong_view;
    private AdminView admin_view;
    private CaesView caes_view;
    private GatosView gato_view;

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
        Scanner leitor = new Scanner(System.in);
        int selection = app_view.menu_principal(leitor);

        switch (selection) {
            case 1:
                repo_cao.listagem_caes();
                repo_gato.listagem_gatos();
                iniciar();
                break;
            case 2:
                Ong ong_cadastrada = ong_view.inserir_ong(leitor);
                repo_ong.getAbrigos_cadastrados().add(ong_cadastrada);

                repo_gato.getGatos_cadastrados().add(gato_view.cadastro_gato(leitor, ong_cadastrada));
                repo_cao.getCaes_cadastrados().add(caes_view.inserir_cao(leitor, ong_cadastrada));
                iniciar();
                break;
            case 3:
                Dono dono_cadastrado = dono_view.inserir_dono(leitor);
                repo_dono.getDonos_cadastrados().add(dono_cadastrado);

                repo_gato.getGatos_cadastrados().add(gato_view.cadastro_gato(leitor, dono_cadastrado));
                repo_cao.getCaes_cadastrados().add(caes_view.inserir_cao(leitor, dono_cadastrado));
                iniciar();

                break;
            case 4:
                repo_adotante.getAdotantes_cadastrados().add(adotante_view.inserir_adotante(leitor));
                adotante_view.iniciar_adoção(leitor, repo_cao, repo_gato);
                break;
            case 7:
                if (admin_view.validador_adm(leitor, administrador)) {
                    inciar_adm(leitor);
                } else {
                    iniciar();
                }
                break;
            default:
                System.out.println("Opção inválida");
                iniciar();
        }
    }

    public void popular_repositorios() {
        Ong abrigo1 = new Ong("Leonardo", "Avenida Esperança n.5", "test@gmail.com", "123456789", "12345678950",
                "Spa dos Pets");

        Vacina vacina1 = new Vacina("10/05/2022", "V10");
        Vacina vacina2 = new Vacina("02/03/2022", "V8");
        Vacina vacina3 = new Vacina("20/04/2022", "Vacina da Gripe Canína");
        Vacina vacina4 = new Vacina("14/11/2022", "V5");
        Vacina vacina5 = new Vacina("03/09/2021", "V3");

        FichaMedica f1 = new FichaMedica(true, vacina1);
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Spyke", "05/2016", "Marrom", "28kg", "Macho", "Boxer", f1, abrigo1, "Grande"));
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Poly", "02/2015", "Preto e branco", "16kg", "Fêmea", "Border Collie", f1, abrigo1,
                        "Grande"));

        FichaMedica f2 = new FichaMedica(false, vacina2);
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Bolinha", "04/2019", "Branco", "8kg", "Fêmea", "SRD", f2, abrigo1, "Pequeno"));
        repo_cao.getCaes_cadastrados()
                .add(new Caes("Duncan", "06/2010", "Caramelo", "12kg", "Macho", "Beagle", f1, abrigo1, "Grande"));

        FichaMedica f3 = new FichaMedica(true, vacina3);
        repo_cao.getCaes_cadastrados().add(new Caes("Mali", "01/2017", "Caramelo e preto", "50kg", "Macho",
                "Pastor Belga Malinois", f3, abrigo1, "Grande"));

        FichaMedica f4 = new FichaMedica(true, vacina4);
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Fifi", "10/2022", "Preto e branco", "4kg", "Fêmea", "SRD", f4, abrigo1, false));
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Jurandira", "03/2020", "Preto e branco", "5kg", "Fêmea", "SRD", f4, abrigo1, false));
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Gaia", "07/2019", "Creme", "4kg", "Fêmea", "Siamês", f4, abrigo1, false));

        FichaMedica f5 = new FichaMedica(true, vacina5);
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Amendoim", "04/2013", "Laranja e branco", "5kg", "Macho", "SRD", f5, abrigo1, false));
        repo_gato.getGatos_cadastrados()
                .add(new Gatos("Marie", "07/2011", "Branco", "6kg", "Fêmea", "SRD", f5, abrigo1, false));
    }

    public void inciar_adm(Scanner entrada) {
        int op = admin_view.menu_adm(entrada);
        switch (op) {
            case 1:
                repo_ong.listagem_ong();
                inciar_adm(entrada);
                break;
            case 2:
                repo_adotante.listagem_adotantes();
                inciar_adm(entrada);
                break;
            case 3:
                repo_dono.listagem_donos();
                inciar_adm(entrada);
                break;
            case 4:
                repo_cao.listagem_caes();
                inciar_adm(entrada);
                break;
            case 5:
                repo_gato.listagem_gatos();
                inciar_adm(entrada);
                break;
            case 6:
                int[] selection = admin_view.remover_dados(entrada, repo_ong, repo_dono, repo_adotante, repo_cao,
                        repo_gato);
                if (selection[0] == 1) {
                    repo_ong.deletarOngById(selection[1]);
                } else if (selection[0] == 2) {
                    repo_dono.deletarDonoById(selection[1]);
                } else if (selection[0] == 3) {
                    repo_adotante.deletarAdotanteById(selection[1]);
                } else if (selection[0] == 4) {
                    repo_cao.deletarCaesById(selection[1]);
                } else if (selection[0] == 5) {
                    repo_gato.deletarGatosById(selection[1]);
                } else {
                    inciar_adm(entrada);
                }
                break;
            default:
                inciar_adm(entrada);
                break;
        }
    }
}