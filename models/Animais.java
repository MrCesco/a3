package models;
import java.util.Date;

public abstract class Animais {
    private String nome;
    private Date dataNascimento;
    private String cor;
    private String peso;
    private String genero;
    private String raca;
    private FichaMedica fichaMedica;

    public Animais(String nome, Date dataNascimento, String cor, String peso, String genero, String raca,
            FichaMedica fichaMedica) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cor = cor;
        this.peso = peso;
        this.genero = genero;
        this.raca = raca;
        this.fichaMedica = fichaMedica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public FichaMedica getFichaMedica() {
        return fichaMedica;
    }

    public void setFichaMedica(FichaMedica fichaMedica) {
        this.fichaMedica = fichaMedica;
    }
    
     
    

    

}