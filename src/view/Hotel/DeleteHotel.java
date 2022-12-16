package view.Hotel;

import br.com.SistemaHotelaria.Aplicacao.RemoveEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteHotel {
    private JTextField codigoField;
    private JButton deletarButton;
    private JPanel deletarRoot;

    public static void initComponents() {
        JFrame frame = new JFrame("DeleteHotel");
        frame.setContentPane(new DeleteHotel().deletarRoot);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public DeleteHotel() {
        deletarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RemoveEmBanco.removeHotel(Integer.parseInt(codigoField.getText()));
            }
        });
    }
}
