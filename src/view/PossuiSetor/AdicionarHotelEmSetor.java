package view.PossuiSetor;

import br.com.SistemaHotelaria.Aplicacao.InsereEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AdicionarHotelEmSetor {
    private JTextField codigoHotelField;
    private JTextField codigoSetorField;
    private JButton adicionarButton;
    private JPanel rootPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("AdicionarHotelEmSetor");
        frame.setContentPane(new AdicionarHotelEmSetor().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public AdicionarHotelEmSetor() {
        adicionarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InsereEmBanco.inserePossuiSetor(
                        Integer.valueOf(codigoHotelField.getText()),
                        Integer.valueOf(codigoSetorField.getText())
                );
            }
        });
    }
}
