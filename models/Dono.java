package models;

public class Dono extends Pessoa {
    private String tipo_cadastro;

    public Dono(String nome, String endereco, String cpf, String email, String telefone, String tipo_cadastro) {
        super(nome, endereco, cpf, email, telefone);
        this.tipo_cadastro = tipo_cadastro;
    }

    public String getTipo_cadastro() {
        return tipo_cadastro;
    }

    public void setTipo_cadastro(String tipo_cadastro) {
        this.tipo_cadastro = tipo_cadastro;
    }

    @Override
    public String toString() {
        return "Dono [tipo_cadastro=" + tipo_cadastro + "]";
    }
}