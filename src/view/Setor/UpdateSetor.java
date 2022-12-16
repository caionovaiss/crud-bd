package view.Setor;

import br.com.SistemaHotelaria.Aplicacao.UpdateEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateSetor {
    private JTextField codigoSetorField;
    private JTextField nomeField;
    private JTextField descricaoField;
    private JTextField localizacaoField;
    private JTextField finalidadeField;
    private JTextField infraField;
    private JButton atualizarButton;
    private JPanel updateSetorPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("UpdateSetor");
        frame.setContentPane(new UpdateSetor().updateSetorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public UpdateSetor() {
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UpdateEmBanco.updateSetor(
                        Integer.valueOf(codigoSetorField.getText()),
                        descricaoField.getText(),
                        nomeField.getText(),
                        localizacaoField.getText(),
                        finalidadeField.getText(),
                        infraField.getText()
                );

            }
        });
    }
}
