package models;

public class Abrigo extends Pessoa {
    private String cnpj;
    private String r_social;

    public Abrigo(int id, String nome, String endereco, String cpf, String email, String telefone, String tipo_cadastro,
            String cnpj, String r_social) {
        super(id, nome, endereco, cpf, email, telefone, tipo_cadastro);
        this.cnpj = cnpj;
        this.r_social = r_social;
    }

    @Override
    public String toString() {
        return super.toString() + "CNPJ: " + cnpj + "\n" + "Razão Social: " + r_social + "\n";
    }

}