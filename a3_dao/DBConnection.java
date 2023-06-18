// package a3_dao;
// import java.sql.Connection;
// import java.sql.DriverManager;

// public class DBConnection {
//     private static DBConnection instance = null;
//     private Connection conn = null;
//     private String url = "jdbc:mysql://localhost:3306/";
//     private String dbName = "adocaoPets";
 
//     private DBConnection() {
//         try {
//             conn = DriverManager.getConnection(url + dbName, "root", "");
//         } catch (Exception e) {
            
//             e.printStackTrace();
//         }
        
//     }  
//     public static DBConnection getInstance() {
//         if (instance == null) {
//             instance = new DBConnection();
//         }
//         return instance;
//     } 

//     public Connection getConnection() {
//         return conn;
//     }
// }