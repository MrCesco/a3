package models;

public class ONG extends Pessoa {
    private String cnpj;
    private String r_social;

    public ONG(String nome, String endereco, String cpf, String email, String telefone, String cnpj,
            String r_social) {
        super(nome, endereco, cpf, email, telefone);
        this.cnpj = cnpj;
        this.r_social = r_social;
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

    @Override
    public String toString() {
        return "Abrigo [cnpj=" + cnpj + ", r_social=" + r_social + "]";
    }
}