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
            PreparedStatement ps = conn.prepareStatement("select * from pessoas");
            ResultSet resultSet = ps.executeQuery();
            //resultSet.first();
            while (resultSet.next()) {
                Pessoa tmp = new Pessoa(resultSet.getString("Joãozinho"), resultSet.getString("Rua Tal 123"), resultSet.getString("123456"),
                resultSet.getString("joaozinho@email.com.br"), resultSet.getString("(51)99123456"));
                retorno.add(tmp);
                
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno;
    }

    public static Turma salvarTurma(Turma turma) {
        Connection conn = DBConnection.getInstance().getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into turmas (apelido, capacidade, ucs_iducs) values (?,?,?)");
            ps.setString(1, turma.getApelido());
            ps.setInt(2, turma.getCapacidade());
            ps.setInt(3, turma.getUcs_iducs());
            ps.executeUpdate();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
    
}
