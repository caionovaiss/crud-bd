package view.Categoria;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CategoriaScreen {
    private JButton cadastrarCategoriaButton;
    private JButton removerCategoriaButton;
    private JButton atualizarCategoriaButton;
    private JButton verCategoriasButton;
    private JPanel categoriaScreenPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("CategoriaScreen");
        frame.setContentPane(new CategoriaScreen().categoriaScreenPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CategoriaScreen() {
    cadastrarCategoriaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            CreateCategoria.initComponents();
        }
    });
    removerCategoriaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            DeleteCategoria.initComponents();
        }
    });
    atualizarCategoriaButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            UpdateCategoria.initComponents();
        }
    });
    verCategoriasButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            ReadCategoria.initComponents();
        }
    });
}
}
