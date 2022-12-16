package view.PossuiSetor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PossuiSetorScreen {
    private JButton adicionarButton;
    private JButton excluirButton;
    private JButton verPossuiSetorButton;
    private JPanel rootPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("PossuiSetorScreen");
        frame.setContentPane(new PossuiSetorScreen().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public PossuiSetorScreen() {
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AdicionarHotelEmSetor.initComponents();
            }
        });
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ExcluirHotelDeSetor.initComponents();
            }
        });
        verPossuiSetorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ReadPossuiSetor.initComponents();
            }
        });
    }
}
