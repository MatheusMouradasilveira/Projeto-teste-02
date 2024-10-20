package DAO;

import Model.LivroModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LivroBancoDados {

    public void inserirLivroBD(LivroModel livro) {
        String sql = "INSERT INTO Livro (titulo, genero, npaginas, sinopse, autornome, autornacio) values (?, ?, ?, ?, ?, ?)";
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = new ConexaoBD().getConnection();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, livro.getTitulo());
            stmt.setString(2, livro.getGenero());
            stmt.setInt(3, livro.getNpaginas());
            stmt.setString(4, livro.getSinopse());
            stmt.setString(5, livro.getAutornome());
            stmt.setString(6, livro.getAutornacio());
            stmt.execute();
            JOptionPane.showMessageDialog(null, "Dados inseridos no banco de daods com sucesso!");
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