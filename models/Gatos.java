package models;
import java.util.Date;

public class Gatos extends Animais {
    private boolean testeFIP_FELV;    

    public Gatos(String nome, Date dataNascimento, String cor, String peso, String genero, String raca,
            FichaMedica fichaMedica, boolean testeFIP_FELV) {
        super(nome, dataNascimento, cor, peso, genero, raca, fichaMedica);
        this.testeFIP_FELV = testeFIP_FELV;
    }

    public boolean isTesteFIP_FELV() {
        return testeFIP_FELV;
    }

    public void setTesteFIP_FELV(boolean testeFIP_FELV) {
        this.testeFIP_FELV = testeFIP_FELV;
    }   
    
    
    
}