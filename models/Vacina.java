package models;

public class Vacina {
    private String dataAplicacao;
    private String nome_vacina;
    
    public Vacina(String dataAplicacao, String nome) {
        this.dataAplicacao = dataAplicacao;
        this.nome_vacina = nome;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getNome_vacina() {
        return nome_vacina;
    }

    public void setNome_vacina(String nome) {
        this.nome_vacina = nome;
    }

    @Override
    public String toString() {
        return " Vacina: " + nome_vacina + " aplicada no dia: " + dataAplicacao;
    }
}