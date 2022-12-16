package view.Setor;

import view.PossuiSetor.PossuiSetorScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SetorScreen {
    private JButton cadastrarSetorButton;
    private JButton removerSetorButton;
    private JButton atualizarSetorButton;
    private JButton verSetoresButton;
    private JPanel setorScreenPanel;
    private JButton modificarHoteisButton;

    public static void initComponents() {
        JFrame frame = new JFrame("SetorScreen");
        frame.setContentPane(new SetorScreen().setorScreenPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public SetorScreen() {
        cadastrarSetorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CreateSetor.initComponents();
            }
        });
        atualizarSetorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UpdateSetor.initComponents();
            }
        });
        removerSetorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteSetor.initComponents();
            }
        });
        verSetoresButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ReadSetor.initComponents();
            }
        });
        modificarHoteisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PossuiSetorScreen.initComponents();
            }
        });
    }
}
