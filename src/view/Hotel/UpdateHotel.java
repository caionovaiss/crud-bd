package view.Hotel;

import br.com.SistemaHotelaria.Aplicacao.UpdateEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateHotel {
    private JTextField cnpjField;
    private JTextField cnaesField;
    private JTextField razaoField;
    private JTextField faturamentoField;
    private JTextField dataField;
    private JTextField cepField;
    private JTextField bairroField;
    private JTextField estadoField;
    private JTextField cidadeField;
    private JTextField logradouroField;
    private JTextField numeroField;
    private JTextField tamanhoField;
    private JTextField nomeFField;
    private JTextField catField;
    private JTextField setorField;
    private JButton atualizarButton;
    private JPanel rootPanel;
    private JTextField codigoHotelField;

    public static void initComponents() {
        JFrame frame = new JFrame("UpdateHotel");
        frame.setContentPane(new UpdateHotel().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(600, 600);
        frame.setVisible(true);
    }

    public UpdateHotel() {
        atualizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                UpdateEmBanco.updateHotel(
                        Integer.valueOf(codigoHotelField.getText()),
                        cnpjField.getText(),
                        cnaesField.getText(),
                        razaoField.getText(),
                        Integer.valueOf(faturamentoField.getText()),
                        dataField.getText(),
                        cepField.getText(),
                        bairroField.getText(),
                        estadoField.getText(),
                        cidadeField.getText(),
                        logradouroField.getText(),
                        Integer.valueOf(numeroField.getText()),
                        tamanhoField.getText(),
                        nomeFField.getText(),
                        Integer.valueOf(catField.getText())
                );
            }
        });
    }
}
