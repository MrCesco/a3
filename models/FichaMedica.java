package models;

public class FichaMedica {
    private boolean castracao;
    private Vacina vacinas;
    
    public FichaMedica(boolean castracao, Vacina vacinas) {
        this.castracao = castracao;
        this.vacinas = vacinas;
    }

    public boolean isCastracao() {
        return castracao;
    }

    public void setCastracao(boolean castracao) {
        this.castracao = castracao;
    }

    public Vacina getVacinas() {
        return vacinas;
    }

    public void setVacinas(Vacina vacinas) {
        this.vacinas = vacinas;
    }

    @Override
    public String toString() {
        return "Castrado: " + castracao + "/" + vacinas.toString();
    }
}