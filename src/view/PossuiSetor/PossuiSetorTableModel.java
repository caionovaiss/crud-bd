package view.PossuiSetor;

import br.com.SistemaHotelaria.Hotel.Hotel;
import br.com.SistemaHotelaria.Hotel.HotelDAO;
import br.com.SistemaHotelaria.PossuiSetor.PossuiSetor;
import br.com.SistemaHotelaria.PossuiSetor.PossuiSetorDAO;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class PossuiSetorTableModel extends AbstractTableModel {

    List<PossuiSetor> possuiSetorList;

    public PossuiSetorTableModel() {
        this.possuiSetorList = pegarPossuiSetor();
    }

    public static List<PossuiSetor> pegarPossuiSetor() {
        PossuiSetorDAO psDao = new PossuiSetorDAO();
        return psDao.getPossuiSetor();
    }

    private String[] colunas = {"Codigo Hotel",
            "Codigo Setor",
    };

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public int getRowCount() {
        return possuiSetorList.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int lin, int col) {
        switch (col) {
            case 0:
                return possuiSetorList.get(lin).getCodigo_hotel();
            case 1:
                return possuiSetorList.get(lin).getCodigo_setor();
        }
        return null;
    }
}