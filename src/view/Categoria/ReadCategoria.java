package view.Categoria;

import javax.swing.*;

public class ReadCategoria {
    private JTable categoriaTable;
    private JPanel panel1;

    CategoriaTableModel ctModel = new CategoriaTableModel();

    public ReadCategoria(){
        categoriaTable.setModel(ctModel);
    }

    public static void initComponents() {
        JFrame frame = new JFrame("ReadCategoria");
        frame.setContentPane(new ReadCategoria().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(1500, 200);
        frame.setVisible(true);
    }
}
