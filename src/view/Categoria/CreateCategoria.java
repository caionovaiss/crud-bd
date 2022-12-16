package view.Categoria;

import br.com.SistemaHotelaria.Aplicacao.InsereEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateCategoria {
    private JTextField estrelasField;
    private JTextField descricaoField;
    private JTextField nomeField;
    private JButton criarCategoriaButton;
    private JPanel rootPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("CreateCategoria");
        frame.setContentPane(new CreateCategoria().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    public CreateCategoria() {
        criarCategoriaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                InsereEmBanco.insereCategoria(
                        Integer.valueOf(estrelasField.getText()),
                        descricaoField.getText(),
                        nomeField.getText()
                );

            }
        });
    }
}
