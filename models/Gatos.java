package models;

public class Gatos extends Animais {
    private boolean testeFIV_FELV;

    public Gatos(String nome, String dataNascimento, String cor, String peso, String genero, String raca,
            FichaMedica fichaMedica, Pessoa responsavel, boolean testeFIV_FELV) {
        super(nome, dataNascimento, cor, peso, genero, raca, fichaMedica, responsavel);
        this.testeFIV_FELV = testeFIV_FELV;
    }

    public boolean isTesteFIV_FELV() {
        return testeFIV_FELV;
    }

    public void setTesteFIV_FELV(boolean testeFIP_FELV) {
        this.testeFIV_FELV = testeFIP_FELV;
    }    
}