package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    // referencia para o drive de conexao
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/HOTELARIA";

    public static Connection DBConnection(){
        Connection connection = null;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(DATABASE_URL, USERNAME,PASSWORD);
        } catch (Exception e){
            System.out.printf(e.getMessage());
        }

        return connection;
    }
}
