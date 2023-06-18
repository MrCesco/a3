package models;

public class Medicamento {
    private String dataAplicacao;
    private String tipo;

    public Medicamento(String dataAplicacao, String tipo) {
        this.dataAplicacao = dataAplicacao;
        this.tipo = tipo;
    }

    public String getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(String dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
       
    
    
    
}