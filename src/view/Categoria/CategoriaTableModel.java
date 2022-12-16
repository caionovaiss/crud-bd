package view.Categoria;

import br.com.SistemaHotelaria.Categoria.Categoria;
import br.com.SistemaHotelaria.Categoria.CategoriaDAO;

import javax.swing.table.AbstractTableModel;
import java.util.List;

public class CategoriaTableModel extends AbstractTableModel {

    List<Categoria> categoriaList;
    public CategoriaTableModel(){
        this.categoriaList = getCategorias();
    }

    public static List<Categoria> getCategorias(){
        CategoriaDAO cd = new CategoriaDAO();
        return cd.getCategorias();
    }
    private String[] colunas = {"Codigo Categoria",
            "Estrelas",
            "Descricao",
            "Nome"
    };

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }

    @Override
    public int getRowCount() {
        return categoriaList.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int lin, int col) {
        switch (col){
            case 0:
                return categoriaList.get(lin).getCodigo_categoria();
            case 1:
                return categoriaList.get(lin).getQntd_estrelas();
            case 2:
                return categoriaList.get(lin).getDescricao();
            case 3:
                return categoriaList.get(lin).getNome();
        }
        return null;
    }

}
