/* 
package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
    private static DBConnection instance = null;
    private Connection conn = null;
    private String url = "jdbc:mysql://localhost:3306/";
    private String dbName = "adocaoPets";
 
    private DBConnection() {
        try {
            //Class.forName(driver);
            conn = DriverManager.getConnection(url + dbName, "root", "");
        } catch (Exception e) {
            
            e.printStackTrace();
        }
        //System.out.println(conn);
        
    }  
    public static DBConnection getInstance() {
        if (instance == null) {
            instance = new DBConnection();
        }
        return instance;
    } 

    public Connection getConnection() {
        return conn;
    }
}
*/