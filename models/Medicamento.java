package models;
import java.util.Date;

public class Medicamento {
    private Date dataAplicacao;
    private String tipo;
    
    public Medicamento(Date dataAplicacao, String tipo) {
        this.dataAplicacao = dataAplicacao;
        this.tipo = tipo;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    
}