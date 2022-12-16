package view.Setor;

import br.com.SistemaHotelaria.Setor.Setor;
import br.com.SistemaHotelaria.Setor.SetorDAO;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class SetorTableModel extends AbstractTableModel {
    List<Setor> setorList;

    public SetorTableModel() {
        this.setorList = getSetores();
    }

    public static List<Setor> getSetores() {
        SetorDAO sd = new SetorDAO();
        return sd.getSetores();
    }

    private String[] colunas = {"codigo_setor",
            "descricao",
            "nome",
            "localizacao",
            "finalidade",
            "infraestrutura"};

    @Override
    public int getRowCount() {
        return setorList.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int lin, int col) {
        switch (col) {
            case 0:
                return setorList.get(lin).getCodigo_setor();
            case 1:
                return setorList.get(lin).getDescricao();
            case 2:
                return setorList.get(lin).getNome();
            case 3:
                return setorList.get(lin).getLocalizacao();
            case 4:
                return setorList.get(lin).getFinalidade();
            case 5:
                return setorList.get(lin).getInfraestrutura();
        }
        return null;
    }
}
