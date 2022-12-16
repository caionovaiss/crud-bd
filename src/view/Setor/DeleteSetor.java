package view.Setor;

import br.com.SistemaHotelaria.Aplicacao.RemoveEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteSetor {
    private JTextField codigoSetorField;
    private JPanel DeleteSetorPanel;
    private JButton excluirButton;

    public static void initComponents() {
        JFrame frame = new JFrame("DeleteSetor");
        frame.setContentPane(new DeleteSetor().DeleteSetorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public DeleteSetor() {
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                RemoveEmBanco.removeSetor(
                        Integer.valueOf(codigoSetorField.getText())
                );

            }
        });
    }
}
