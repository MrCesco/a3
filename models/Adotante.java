package models;

public class Adotante extends Pessoa {
    private String tipo_cadastro;

    public Adotante(String nome, String endereco, String cpf, String email, String telefone,
            String tipo_cadastro) {
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
        return "Adotante [tipo_cadastro=" + tipo_cadastro + "]";
    }
}