package models;

public class FichaMedica {
    private boolean castracao;
    private Vacina vacinas;
    private Medicamento medicamentos;
    
    public FichaMedica(boolean castracao, Vacina vacinas, Medicamento medicamentos) {
        this.castracao = castracao;
        this.vacinas = vacinas;
        this.medicamentos = medicamentos;
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

    public Medicamento getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(Medicamento medicamentos) {
        this.medicamentos = medicamentos;
    }   
    
}