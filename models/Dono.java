package models;

public class Dono extends Pessoa {
    private int credencial_dono;
    
    public Dono(int id, String nome, String endereco, String cpf, String email, String telefone, String tipo_cadastro,
            int credencial_dono) {
        super(id, nome, endereco, cpf, email, telefone, tipo_cadastro);
        this.credencial_dono = credencial_dono;
    }

    public int getCredencial_dono() {
        return credencial_dono;
    }

    public void setCredencial_dono(int credencial_dono) {
        this.credencial_dono = credencial_dono;
    }

    @Override
    public String toString() {
        return super.toString() + "Credencial de dono: " + credencial_dono + "\n";
    }
}