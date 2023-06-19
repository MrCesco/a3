package models;

public class Adotante extends Pessoa {
    private String cpf;
    private String tipo_cadastro;

    public Adotante(String nome, String endereco, String email, String telefone, String cpf, String tipo_cadastro) {
        super(nome, endereco, email, telefone);
        this.cpf = cpf;
        this.tipo_cadastro = tipo_cadastro;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipo_cadastro() {
        return tipo_cadastro;
    }

    public void setTipo_cadastro(String tipo_cadastro) {
        this.tipo_cadastro = tipo_cadastro;
    }

     @Override
    public String toString() {
        return "Adotante [tipo_cadastro=" + tipo_cadastro + "]";
    }
}