package view.PossuiSetor;

import javax.swing.*;

public class ReadPossuiSetor {
    private JTable readPossuiSetorTable;
    private JPanel panel1;

    PossuiSetorTableModel psTM = new PossuiSetorTableModel();

    public ReadPossuiSetor() {
        readPossuiSetorTable.setModel(psTM);
    }

    public static void initComponents() {
        JFrame frame = new JFrame("ReadPossuiSetor");
        frame.setContentPane(new ReadPossuiSetor().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
