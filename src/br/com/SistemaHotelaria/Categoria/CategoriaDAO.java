package br.com.SistemaHotelaria.Categoria;

import conexao.ConnectionFactory;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoriaDAO {
    public void save(Categoria categoria) {
        String sql = "INSERT INTO CATEGORIA(" +
                "qntd_estrelas, " +
                "descricao, " +
                "nome" +
                ") VALUES (?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar conexao com banco de dados
            conn = conexao.ConnectionFactory.DBConnection();

            //adicionar valores da query
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, categoria.getQntd_estrelas());
            pstm.setString(2, categoria.getDescricao());
            pstm.setString(3, categoria.getNome());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Categoria inserida com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na inserção de categoria: \n" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (pstm != null)
                    pstm.close();

                if (conn != null)
                    conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Categoria> getCategorias() {
        String sql = "SELECT * FROM CATEGORIA";

        List<Categoria> categorias = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Categoria categoria = new Categoria();
                categoria.setCodigo_categoria(rset.getInt("codigo_categoria"));
                categoria.setQntd_estrelas(rset.getInt("qntd_estrelas"));
                categoria.setDescricao(rset.getString("descricao"));
                categoria.setNome(rset.getString("nome"));

                categorias.add(categoria);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na recuperação de categorias");
        } finally {
            try {
                if (rset != null)
                    rset.close();
                if (pstm != null)
                    pstm.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }

        return categorias;
    }

    public void update(Categoria categoria) {
        String sql = "UPDATE CATEGORIA SET " +
                "qntd_estrelas = ?, " +
                "descricao = ?, " +
                "nome = ? " +
                "WHERE codigo_categoria = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, categoria.getQntd_estrelas());
            pstm.setString(2, categoria.getDescricao());
            pstm.setString(3, categoria.getNome());

            pstm.setInt(4, categoria.getCodigo_categoria());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Atualização feita com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na atualização: \n" + e.getMessage());
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteCategoriaByID(int codigo) {
        String sql = "DELETE FROM CATEGORIA WHERE codigo_categoria = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, codigo);
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Categoria excluída com sucesso");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Falha na exclusão da categoria: \n" + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}
