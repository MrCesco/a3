package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import models.*;

public class PessoaDAO {    

    public static List<Pessoa> getPessoas() {
        Connection conn = DBConnection.getInstance().getConnection();
        List<Pessoa> retorno = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from cadastros");
            ResultSet resultSet = ps.executeQuery();
            //resultSet.first();
            while (resultSet.next()) {
                Pessoa tmp = new Pessoa(resultSet.getString("nome_cadastro"), resultSet.getString("local"), resultSet.getString("cpf"),
                resultSet.getString("email"), resultSet.getString("telefone"), resultSet.getString("tipo_cadastro"));
                retorno.add(tmp);
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public static Pessoa salvarPessoa(Pessoa pessoa) {
        Connection conn = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into cadastros (nome_cadastro, local, cpf, email, telefone, tipo_cadastro) values (?,?,?,?,?,?)");
            ps.setString(1, pessoa.getNome());
            ps.setString(2, pessoa.getEndereco());
            ps.setString(3, pessoa.getCpf());
            ps.setString(4, pessoa.getEmail());
            ps.setString(5, pessoa.getTelefone());
            ps.setString(6, pessoa.getTipo_cadastro());
            
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
