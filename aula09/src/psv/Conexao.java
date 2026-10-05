package psv;

import java.sql.*;

public class Conexao {
    public static Connection abirConexao() {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            
            String url = "";
            url += "jdbc:mysql://127.0.0.1/estacionamento?";
            url += "user=root&password=";

            con = DriverManager.getConnection(url);
            System.out.println("Aberto");
        } catch(SQLException e) {
            System.out.println(e.getMessage());
        } catch(ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return con;
    }
}
