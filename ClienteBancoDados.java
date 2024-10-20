package DAO;

import Model.ClienteModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

public class ClienteBancoDados {

    public void inserirClienteBD(ClienteModel cliente) {
        String sql = "INSERT INTO Cliente (nome, cpf, telefone, endereco, dataderegistro) values (?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement stmt = null;
        LocalDate ddr = cliente.getDataderegistro();
        java.sql.Date dataderegistro = java.sql.Date.valueOf(ddr);

        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEndereco());
            stmt.setDate(5, dataderegistro);
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos no banco de dados com sucesso!");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao conectar o banco de dados");
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao fechar o stmt");
            }

            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException sQLException) {
                sQLException.printStackTrace();
                JOptionPane.showMessageDialog(null, "Erro ao encerrar a conexão");
            }
        }
    }
}