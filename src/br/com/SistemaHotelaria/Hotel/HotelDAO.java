package br.com.SistemaHotelaria.Hotel;

import conexao.ConnectionFactory;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class HotelDAO {
    //CRUD
    public void save(Hotel hotel) {
        String sql = "INSERT INTO HOTEL(CNPJ, " +
                "CNAES, " +
                "razao_social, " +
                "faturamento_anual, " +
                "data_abertura, " +
                "end_CEP, " +
                "end_bairro, " +
                "end_estado, " +
                "end_cidade, " +
                "end_logradouro, " +
                "end_numero, " +
                "tamanho, " +
                "nome_fantasia, " +
                "codigo_categoria " +
                ") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            //criar conexao com banco de dados
            conn = ConnectionFactory.DBConnection();

            //adicionar valores da query
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, hotel.getCNPJ());
            pstm.setString(2, hotel.getCNAES());
            pstm.setString(3, hotel.getRazao_social());
            pstm.setFloat(4, hotel.getFaturamento_anual());
            pstm.setDate(5, hotel.getData_abertura());
            pstm.setString(6, hotel.getEnd_CEP());
            pstm.setString(7, hotel.getEnd_bairro());
            pstm.setString(8, hotel.getEnd_estado());
            pstm.setString(9, hotel.getEnd_cidade());
            pstm.setString(10, hotel.getEnd_logradouro());
            pstm.setInt(11, hotel.getEnd_numero());
            pstm.setString(12, hotel.getTamanho());
            pstm.setString(13, hotel.getNome_fantasia());
            pstm.setInt(14, hotel.getCodigo_categoria());

            pstm.execute();

            getMaxID(hotel);
            inserirPossuiSetor(hotel);

            JOptionPane.showMessageDialog(null, "Inserção do Hotel " + hotel.getNome_fantasia() + " feita com sucesso");

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao criar Hotel: \n" + e.getMessage());
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

    public List<Hotel> getHoteis() {
        String sql = "SELECT * FROM HOTEL";

        List<Hotel> hoteis = new ArrayList<>();

        Connection conn = null;
        PreparedStatement pstm = null;

        ResultSet rset = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            rset = pstm.executeQuery();

            while (rset.next()) {
                Hotel hotel = new Hotel();
                hotel.setCodigo_hotel(rset.getInt("codigo_hotel"));
                hotel.setCNPJ(rset.getString("CNPJ"));
                hotel.setCNAES(rset.getString("CNAES"));
                hotel.setRazao_social(rset.getString("razao_social"));
                hotel.setFaturamento_anual(rset.getFloat("faturamento_anual"));
                hotel.setData_abertura(rset.getString("data_abertura"));
                hotel.setEnd_CEP(rset.getString("end_CEP"));
                hotel.setEnd_bairro(rset.getString("end_bairro"));
                hotel.setEnd_estado(rset.getString("end_estado"));
                hotel.setEnd_cidade(rset.getString("end_cidade"));
                hotel.setEnd_logradouro(rset.getString("end_logradouro"));
                hotel.setEnd_numero(rset.getInt("end_numero"));
                hotel.setTamanho(rset.getString("tamanho"));
                hotel.setNome_fantasia(rset.getString("nome_fantasia"));
                hotel.setCodigo_categoria(rset.getInt("codigo_categoria"));

                hoteis.add(hotel);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha ao recuperar Hoteis: \n" + e.getMessage());
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

        return hoteis;
    }

    public void update(Hotel hotel) {
        String sql = "UPDATE HOTEL SET " +
                "CNPJ = ?, " +
                "CNAES = ?, " +
                "razao_social = ?, " +
                "faturamento_anual = ?, " +
                "data_abertura = ?, " +
                "end_CEP = ?, " +
                "end_bairro = ?, " +
                "end_estado = ?, " +
                "end_cidade = ?, " +
                "end_logradouro = ?, " +
                "end_numero = ?, " +
                "tamanho = ?, " +
                "nome_fantasia = ?, " +
                "codigo_categoria = ? " +
                "WHERE codigo_hotel = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm = conn.prepareStatement(sql);
            pstm.setString(1, hotel.getCNPJ());
            pstm.setString(2, hotel.getCNAES());
            pstm.setString(3, hotel.getRazao_social());
            pstm.setFloat(4, hotel.getFaturamento_anual());
            pstm.setDate(5, hotel.getData_abertura());
            pstm.setString(6, hotel.getEnd_CEP());
            pstm.setString(7, hotel.getEnd_bairro());
            pstm.setString(8, hotel.getEnd_estado());
            pstm.setString(9, hotel.getEnd_cidade());
            pstm.setString(10, hotel.getEnd_logradouro());
            pstm.setInt(11, hotel.getEnd_numero());
            pstm.setString(12, hotel.getTamanho());
            pstm.setString(13, hotel.getNome_fantasia());
            pstm.setInt(14, hotel.getCodigo_categoria());

            pstm.setInt(15, hotel.getCodigo_hotel());

            pstm.execute();

            JOptionPane.showMessageDialog(null, "Atualização de Hotel feita com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na atualização do hotel: \n" + e.getMessage());
        } finally {
            try {
                pstm.close();
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    public void deleteHotelById(int codigo) {
        String sql = "DELETE FROM HOTEL WHERE codigo_hotel = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, codigo);

            updateEmPossuiSetor(codigo);
            pstm.execute();

            JOptionPane.showMessageDialog(null, "Hotel excluído com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falha na exclusãod o hotel: \n" + e.getMessage());
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
        String sql = "DELETE FROM POSSUI_SETOR WHERE codigo_hotel = ?";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, codigo);

            pstm.execute();
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

    public void getMaxID(Hotel hotel) {
        String sql = "SELECT MAX(codigo_hotel) FROM HOTEL";

        Connection conn = null;
        PreparedStatement pstm = null;
        ResultSet resultSet = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            resultSet = pstm.executeQuery();

            while (resultSet.next()) {
                hotel.setCodigo_hotel(resultSet.getInt("MAX(codigo_hotel)"));
            }

            System.out.println("codigo setor: " + hotel.getCodigo_setor());

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

    public void inserirPossuiSetor(Hotel hotel) {
        String sql = "INSERT INTO POSSUI_SETOR(codigo_hotel, codigo_setor) " +
                "VALUES(?, ?)";

        Connection conn = null;
        PreparedStatement pstm = null;

        try {
            conn = ConnectionFactory.DBConnection();
            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, hotel.getCodigo_hotel());
            pstm.setInt(2, hotel.getCodigo_setor());

            pstm.execute();
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