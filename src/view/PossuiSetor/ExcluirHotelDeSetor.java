package view.PossuiSetor;

import br.com.SistemaHotelaria.Aplicacao.RemoveEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExcluirHotelDeSetor {
    private JTextField codigoSetorField;
    private JTextField codigoHotelField;
    private JButton excluirButton;
    private JPanel rootPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("ExcluirHotelDeSetor");
        frame.setContentPane(new ExcluirHotelDeSetor().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public ExcluirHotelDeSetor() {
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RemoveEmBanco.removePossuiSetor(
                        Integer.valueOf(codigoHotelField.getText()),
                        Integer.valueOf(codigoSetorField.getText()
                        ));
            }
        });
    }
}
