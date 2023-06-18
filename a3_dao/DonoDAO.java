package a3_dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import models.*;

public class DonoDAO {    

    public static List<Dono> getDonos() {
        Connection conn = DBConnection.getInstance().getConnection();
        List<Dono> retorno = new ArrayList<>();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from cadastros");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                Dono tmp = new Dono(resultSet.getString("nome_cadastro"), resultSet.getString("local"), resultSet.getString("cpf"),
                resultSet.getString("email"), resultSet.getString("telefone"), resultSet.getString("tipo_cadastro"));
                tmp.setId(resultSet.getInt("idcadastros"));
                retorno.add(tmp);                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public static Dono salvarDono(Dono dono) {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement ps;
        try {
            if(dono.getId()==0) {
                ps = conn.prepareStatement("insert into cadastros (nome_cadastro, local, cpf, email, telefone) values (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
            } else {
                ps = conn.prepareStatement("update cadastros set nome_cadastro = ?, local = ?, cpf = ?, email = ?, telefone = ? where idCadastros = ?");
                ps.setInt(6, dono.getId());
            }
            
            ps.setString(1, dono.getNome());
            ps.setString(2, dono.getEndereco());
            ps.setString(3, dono.getCpf());
            ps.setString(4, dono.getEmail());
            ps.setString(5, dono.getTelefone());
     
            
            ps.executeUpdate();
            if(dono.getId()==0) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                generatedKeys.next();
                int auto_id = generatedKeys.getInt(1);
                dono.setId(auto_id);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dono;
    }

    public static void deletarDono(int id) {
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
