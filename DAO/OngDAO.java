// package DAO;

// import java.sql.Connection;
// import java.sql.PreparedStatement;
// import java.sql.ResultSet;
// import java.sql.SQLException;
// import java.sql.Statement;
// import java.util.ArrayList;
// import java.util.List;
// import models.*;

// public class OngDAO {    

//     public static List<Ong> getOngs() {
//         Connection conn = DBConnection.getInstance().getConnection();
//         List<Ong> retorno = new ArrayList<>();
//         try {
//             PreparedStatement ps = conn.prepareStatement("select * from cadastros");
//             ResultSet resultSet = ps.executeQuery();
//             while (resultSet.next()) {
//                 Ong tmp = new Ong(resultSet.getString("nome_cadastro"), resultSet.getString("local"), resultSet.getString("cpf"),
//                 resultSet.getString("email"), resultSet.getString("telefone"), null, null);
//                 tmp.setId(resultSet.getInt("idcadastros"));
//                 retorno.add(tmp);                
//             }

//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         return retorno;
//     }

//     public static Ong salvarOng(Ong ong) {
//         Connection conn = DBConnection.getInstance().getConnection();
//         PreparedStatement ps;
//         try {
//             if(ong.getId()==0) {
//                 ps = conn.prepareStatement("insert into cadastros (nome_cadastro, local, cpf, email, telefone) values (?,?,?,?,?)",Statement.RETURN_GENERATED_KEYS);
//             } else {
//                 ps = conn.prepareStatement("update cadastros set nome_cadastro = ?, local = ?, cpf = ?, email = ?, telefone = ? where idCadastros = ?");
//                 ps.setInt(6, ong.getId());
//             }
            
//             ps.setString(1, ong.getNome());
//             ps.setString(2, ong.getEndereco());
//             ps.setString(3, ong.getCpf());
//             ps.setString(4, ong.getEmail());
//             ps.setString(5, ong.getTelefone());
     
            
//             ps.executeUpdate();
//             if(ong.getId()==0) {
//                 ResultSet generatedKeys = ps.getGeneratedKeys();
//                 generatedKeys.next();
//                 int auto_id = generatedKeys.getInt(1);
//                 ong.setId(auto_id);
//             }
            
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//         return ong;
//     }

//     public static void deletarOng(int id) {
//         Connection conn = DBConnection.getInstance().getConnection();
//         PreparedStatement ps;
//         try {
//             ps = conn.prepareStatement("delete from cadastros where idCadastros = ?");
//             ps.setInt(1, id);
//             ps.executeUpdate();
//         } catch (SQLException e) {
//             e.printStackTrace();
//         }
//     }
    
// }
