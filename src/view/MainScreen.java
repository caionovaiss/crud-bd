package view;

import view.Categoria.CategoriaScreen;
import view.Hotel.HotelScreen;
import view.Setor.SetorScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen {
    private JButton hotelButton;
    private JButton setorButton;
    private JButton categoriaButton1;
    private JPanel mainScreenPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("MainScreen");
        frame.setContentPane(new MainScreen().mainScreenPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public MainScreen() {
        hotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                HotelScreen.initComponents();
            }
        });
        setorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SetorScreen.initComponents();
            }
        });
        categoriaButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CategoriaScreen.initComponents();
            }
        });
    }
}
