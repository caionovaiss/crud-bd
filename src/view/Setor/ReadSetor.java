package view.Setor;

import javax.swing.*;

public class ReadSetor {
    private JTable readSetorTable;
    private JPanel panel1;

    SetorTableModel stModel = new SetorTableModel();

    public ReadSetor() {
        readSetorTable.setModel(stModel);
    }

    public static void initComponents() {
        JFrame frame = new JFrame("ReadSetor");
        frame.setContentPane(new ReadSetor().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
