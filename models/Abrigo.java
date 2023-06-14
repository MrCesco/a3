package models;

public class Abrigo extends Pessoa {
    private Pessoa representante;
    private String cnpj;
    private String r_social;
    private int credencial_representante;

    public Abrigo(int id, String nome, String endereco, String cpf, String email, String telefone, String tipo_cadastro,
            Pessoa representante, String cnpj, String r_social, int credencial_representante) {
        super(id, nome, endereco, cpf, email, telefone, tipo_cadastro);
        this.representante = representante;
        this.cnpj = cnpj;
        this.r_social = r_social;
        this.credencial_representante = credencial_representante;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getR_social() {
        return r_social;
    }

    public void setR_social(String r_social) {
        this.r_social = r_social;
    }

    public int getCredencial_representante() {
        return credencial_representante;
    }

    public void setCredencial_representante(int credencial_representante) {
        this.credencial_representante = credencial_representante;
    }

    public Pessoa getRepresentante() {
        return representante;
    }

    public void setRepresentante(Pessoa representante) {
        this.representante = representante;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + cnpj + "\n" + "Razão Social: " + r_social + "\n";
    }

}