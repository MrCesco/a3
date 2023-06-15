package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.*;

public class AdotanteDAO {    

    public static List<Adotante> getAdotantes() {
        Connection conn = DBConnection.getInstance().getConnection();
        List<Adotante> retorno = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from cadastros");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Adotante tmp = new Adotante(resultSet.getString("nome_cadastro"), resultSet.getString("local"), resultSet.getString("cpf"),
                resultSet.getString("email"), resultSet.getString("telefone"), resultSet.getString("tipo_cadastro"));
                tmp.setId(resultSet.getInt("idcadastros"));
                retorno.add(tmp);                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public static Adotante salvarAdotante(Adotante adotante) {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement ps;
        try {
            if(adotante.getId()==0) {
                ps = conn.prepareStatement("insert into cadastros (nome_cadastro, local, cpf, email, telefone) values (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            } else {
                ps = conn.prepareStatement("update cadastros set nome_cadastro = ?, local = ?, cpf = ?, email = ?, telefone = ? where idCadastros = ?");
                ps.setInt(6, adotante.getId());
            }
            
            ps.setString(1, adotante.getNome());
            ps.setString(2, adotante.getEndereco());
            ps.setString(3, adotante.getCpf());
            ps.setString(4, adotante.getEmail());
            ps.setString(5, adotante.getTelefone());
     
            
            ps.executeUpdate();
            if(adotante.getId()==0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                generatedKeys.next();
                int auto_id = generatedKeys.getInt(1);
                adotante.setId(auto_id);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return adotante;
    }

    public static void deletarAdotante(int id) {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement ps;
        try {
            ps = conn.prepareStatement("delete from cadastros where idCadastros = ?");
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
