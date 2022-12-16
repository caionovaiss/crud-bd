package view.Hotel;

import br.com.SistemaHotelaria.Hotel.Hotel;
import br.com.SistemaHotelaria.Hotel.HotelDAO;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class HotelTableModel extends AbstractTableModel {

    List<Hotel> hotelList = new ArrayList<>();

    public HotelTableModel() {
        this.hotelList = pegarHoteis();
    }

    public static List<Hotel> pegarHoteis() {
        HotelDAO hd = new HotelDAO();
        return hd.getHoteis();
    }

    private String[] colunas = {"Codigo Hotel",
            "CPNJ",
            "CNAES",
            "Razao Social",
            "Faturamento Anual",
            "Data abertura",
            "CEP",
            "Bairro",
            "Estado",
            "Cidade",
            "Logradouro",
            "Numero",
            "Tamanho",
            "Nome fantasia",
            "Codigo categoria",
    };

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public int getRowCount() {
        return hotelList.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int lin, int col) {
        switch (col) {
            case 0:
                return hotelList.get(lin).getCodigo_hotel();
            case 1:
                return hotelList.get(lin).getCNPJ();
            case 2:
                return hotelList.get(lin).getCNAES();
            case 3:
                return hotelList.get(lin).getRazao_social();
            case 4:
                return hotelList.get(lin).getFaturamento_anual();
            case 5:
                return hotelList.get(lin).getData_abertura();
            case 6:
                return hotelList.get(lin).getEnd_CEP();
            case 7:
                return hotelList.get(lin).getEnd_bairro();
            case 8:
                return hotelList.get(lin).getEnd_estado();
            case 9:
                return hotelList.get(lin).getEnd_cidade();
            case 10:
                return hotelList.get(lin).getEnd_logradouro();
            case 11:
                return hotelList.get(lin).getEnd_numero();
            case 12:
                return hotelList.get(lin).getTamanho();
            case 13:
                return hotelList.get(lin).getNome_fantasia();
            case 14:
                return hotelList.get(lin).getCodigo_categoria();
        }
        return null;
    }
}