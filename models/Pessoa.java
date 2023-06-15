package models;

public class Pessoa {
    private int id;
    private String nome;
    private String endereco;
    private String cpf;
    private String email;
    private String telefone;

    public Pessoa(String nome, String endereco, String cpf, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return "Pessoa [id=" + id + ", nome=" + nome + ", endereco=" + endereco + ", cpf=" + cpf + ", email=" + email
                + ", telefone=" + telefone + "]";
    }
}