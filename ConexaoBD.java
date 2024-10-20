package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBD {

    Connection conn = null;
    String className = "org.apache.derby.jdbc.ClientDriver";
    String url = "jdbc:derby://localhost:1527/dataLivros";
    String user = "adm1n";
    String password = "passw0rd";

    public Connection getConnection() {
        try {
            Class.forName(className);
            System.out.println("Driver de conexão encontrado!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Driver banco de dados não encontrado");
        }

        try {
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("Conexão com banco de dados realizada com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Erro ao conectar banco de dados");
        }
        
        return conn;
    }
}