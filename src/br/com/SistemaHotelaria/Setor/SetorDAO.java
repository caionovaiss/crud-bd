package br.com.SistemaHotelaria.Setor;

import br.com.SistemaHotelaria.Hotel.Hotel;
import br.com.SistemaHotelaria.Setor.Setor;
import conexao.ConnectionFactory;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SetorDAO {
    public void save(Setor setor) {
        String sql = "INSERT INTO SETOR(descricao, " +
                "nome, " +
                "localizacao, " +
                "finalidade, " +
                "infraestrutura" +
                ") VALUES (?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar conexao com banco de dados
            conn = conexao.ConnectionFactory.DBConnection();

            //adicionar valores da query
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, setor.getDescricao());
            pstm.setString(2, setor.getNome());
            pstm.setString(3, setor.getLocalizacao());
            pstm.setString(4, setor.getFinalidade());
            pstm.setString(5, setor.getInfraestrutura());

            pstm.execute();

            getMaxID(setor);
            inserirPossuiSetor(setor);

            JOptionPane.showMessageDialog(null, "Inserção de Setor feita com sucesso");
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na inserção de Setor: \n" + e.getMessage());
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

    public List<Setor> getSetores() {
        String sql = "SELECT * FROM SETOR";

        List<Setor> setores = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Setor setor = new Setor();
                setor.setCodigo_setor(rset.getInt("codigo_setor"));
                setor.setDescricao(rset.getString("descricao"));
                setor.setNome(rset.getString("nome"));
                setor.setLocalizacao(rset.getString("localizacao"));
                setor.setFinalidade(rset.getString("finalidade"));
                setor.setInfraestrutura(rset.getString("infraestrutura"));

                setores.add(setor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao recuperar Setores: \n" + e.getMessage());
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

        return setores;
    }

    public void update(Setor setor) {
        String sql = "UPDATE SETOR SET " +
                "descricao = ?, " +
                "nome = ?, " +
                "localizacao = ?, " +
                "finalidade = ?, " +
                "infraestrutura = ? " +
                "WHERE codigo_setor = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = conexao.ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setString(1, setor.getDescricao());
            pstm.setString(2, setor.getNome());
            pstm.setString(3, setor.getLocalizacao());
            pstm.setString(4, setor.getFinalidade());
            pstm.setString(5, setor.getInfraestrutura());
            pstm.setInt(6, setor.getCodigo_setor());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Setor atualizado com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao atualizar setor: \n" + e.getMessage());
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteSetorById(int codigo) {
        String sql = "DELETE FROM SETOR WHERE codigo_setor = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, codigo);
            pstm.execute();
            updateEmPossuiSetor(codigo);

            JOptionPane.showMessageDialog(null, "Setor excluído com sucesso");

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao excluir setor: \n" + e.getMessage());
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void updateEmPossuiSetor(int codigo) {
        String sql = "DELETE FROM POSSUI_SETOR WHERE codigo_setor = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, codigo);

            pstm.execute();
            System.out.println("Atualizado em POSSUI_SETOR com sucesso");
        } catch (Exception e) {
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

    public void inserirPossuiSetor(Setor setor) {
        String sql = "INSERT INTO POSSUI_SETOR(codigo_hotel, codigo_setor) " +
                "VALUES(?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, setor.getCodigo_hotel());
            pstm.setInt(2, setor.getCodigo_setor());

            pstm.execute();
            System.out.println("Inserido em POSSUI_SETOR com sucesso");
        } catch (Exception e) {
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

    public void getMaxID(Setor setor) {
        String sql = "SELECT MAX(codigo_setor) FROM SETOR";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet resultSet = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                setor.setCodigo_setor(resultSet.getInt("MAX(codigo_setor)"));
            }

        } catch (Exception e) {
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
}
