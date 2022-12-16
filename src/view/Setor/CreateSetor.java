package view.Setor;

import br.com.SistemaHotelaria.Aplicacao.InsereEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateSetor {
    private JTextField nomeField;
    private JTextField descricaoField;
    private JTextField localizacaoField;
    private JTextField fimField;
    private JTextField infraField;
    private JTextField codigoHotelField;
    private JButton criarSetorButton;
    private JPanel createSetorPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("CreateSetor");
        frame.setContentPane(new CreateSetor().createSetorPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public CreateSetor() {
        criarSetorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InsereEmBanco.insereSetor(
                        descricaoField.getText(),
                        nomeField.getText(),
                        localizacaoField.getText(),
                        fimField.getText(),
                        infraField.getText(),
                        Integer.valueOf(codigoHotelField.getText())
                );

            }
        });
    }
}
