package view.Hotel;

import br.com.SistemaHotelaria.Aplicacao.InsereEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateHotel extends JFrame {
    private JTextField cnpjField;
    private JTextField cnaesField;
    private JTextField razaoField;
    private JTextField faturamentoField;
    private JTextField dataField;
    private JTextField CEPField;
    private JTextField bairroField;
    private JTextField estadoField;
    private JTextField cidadeField;
    private JTextField logradouroField;
    private JTextField numeroField;
    private JTextField tamanhoField;
    private JTextField nomeField;
    private JTextField categoriaField;
    private JTextField setorField;
    private JButton criarHotelButton;
    private JPanel rootPanel;

    public CreateHotel() {
        criarHotelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InsereEmBanco.insereHotel(
                        cnpjField.getText(),
                        cnaesField.getText(),
                        razaoField.getText(),
                        Float.valueOf(faturamentoField.getText()),
                        dataField.getText(),
                        CEPField.getText(),
                        bairroField.getText(),
                        estadoField.getText(),
                        cidadeField.getText(),
                        logradouroField.getText(),
                        Integer.valueOf(numeroField.getText()),
                        tamanhoField.getText(),
                        nomeField.getText(),
                        Integer.valueOf(categoriaField.getText()),
                        Integer.valueOf(setorField.getText())
                        );
            }
        });
    }

    public static void initComponents() {
        JFrame frame = new JFrame("CreateHotel");
        frame.setContentPane(new CreateHotel().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(500,600);
        frame.setVisible(true);
    }
}
