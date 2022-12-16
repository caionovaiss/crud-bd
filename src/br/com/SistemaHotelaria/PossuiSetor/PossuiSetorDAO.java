package br.com.SistemaHotelaria.PossuiSetor;

import conexao.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PossuiSetorDAO {
    public void save(PossuiSetor possuiSetor) {
        String sql = "INSERT INTO POSSUI_SETOR(codigo_hotel, " +
                "codigo_setor " +
                ") VALUES (?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar conexao com banco de dados
            conn = ConnectionFactory.DBConnection();

            //adicionar valores da query
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, possuiSetor.getCodigo_hotel());
            pstm.setInt(2, possuiSetor.getCodigo_setor());

            pstm.execute();

            System.out.printf("Inserido com sucesso");
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

    public List<PossuiSetor> getPossuiSetor() {
        String sql = "SELECT * FROM POSSUI_SETOR";

        List<PossuiSetor> possuiSetor_list = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                PossuiSetor possuiSetor = new PossuiSetor();
                possuiSetor.setCodigo_hotel(rset.getInt("codigo_hotel"));
                possuiSetor.setCodigo_setor(rset.getInt("codigo_setor"));

                possuiSetor_list.add(possuiSetor);
            }

        } catch (SQLException e) {
            e.printStackTrace();
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

        return possuiSetor_list;
    }

    public void update(PossuiSetor possuiSetor) {
        String sql = "UPDATE POSSUI_SETOR SET " +
                "codigo_hotel = ?, " +
                "codigo_setor = ? " +
                "WHERE codigo_hotel = ? AND codigo_setor = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, possuiSetor.getCodigo_hotel());
            pstm.setInt(2, possuiSetor.getCodigo_setor());

            pstm.execute();
        } catch (SQLException e) {
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

    public void deletePossuiSetorById(int codigo_hotel, int codigo_setor) {
        String sql = "DELETE FROM POSSUI_SETOR WHERE codigo_hotel = ? AND codigo_setor = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, codigo_hotel);
            pstm.setInt(2, codigo_setor);
            pstm.execute();

        } catch (SQLException e) {
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
