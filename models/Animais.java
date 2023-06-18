package models;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class Animais {
    private static final AtomicInteger count = new AtomicInteger(0); 
    private int id;   
    private String nome;
    private String dataNascimento;
    private String cor;
    private String peso;
    private String genero;
    private String raca;
    private FichaMedica fichaMedica;

    public Animais(String nome, String dataNascimento, String cor, String peso, String genero, String raca,
            FichaMedica fichaMedica) {
        id = count.incrementAndGet(); 
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
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
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    


    

}