package models;

public class Adotante extends Pessoa {
    private int credencial_adotante;
    
    public Adotante(int id, String nome, String endereco, String cpf, String email, String telefone,
            String tipo_cadastro, int credencial_adotante) {
        super(id, nome, endereco, cpf, email, telefone, tipo_cadastro);
        this.credencial_adotante = credencial_adotante;
    }

    public int getCredencial_adotante() {
        return credencial_adotante;
    }

    public void setCredencial_adotante(int credencial_adotante) {
        this.credencial_adotante = credencial_adotante;
    }

    @Override
    public String toString() {
        return super.toString() + "Crendencial: " + credencial_adotante + "\n";
    }
}