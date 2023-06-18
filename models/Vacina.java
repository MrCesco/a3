package models;

public class Vacina {
    private String dataAplicacao;
    private String nome;
    
    public Vacina(String dataAplicacao, String nome) {
        this.dataAplicacao = dataAplicacao;
        this.nome = nome;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}