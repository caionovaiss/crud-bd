package view.Hotel;

import view.PossuiSetor.PossuiSetorScreen;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HotelScreen {
    private JButton cadastrarHotelButton;
    private JButton removerHotelButton;
    private JButton atualizarHotelButton;
    private JButton verTodosOsHoteisButton;
    private JPanel hotelScreenPanel;
    private JButton removerSetorDeUmButton;

    public static void initComponents() {
        JFrame frame = new JFrame("HotelScreen");
        frame.setContentPane(new HotelScreen().hotelScreenPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public HotelScreen() {
        cadastrarHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                CreateHotel.initComponents();
            }
        });
        atualizarHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UpdateHotel.initComponents();
            }
        });
        removerHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                DeleteHotel.initComponents();
            }
        });
        verTodosOsHoteisButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ReadHotel.initComponents();
            }
        });
        removerSetorDeUmButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                PossuiSetorScreen.initComponents();
            }
        });
    }
}
