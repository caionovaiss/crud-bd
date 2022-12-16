package view.Categoria;

import br.com.SistemaHotelaria.Aplicacao.UpdateEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UpdateCategoria {
    private JTextField codigoField;
    private JTextField estrelasField;
    private JTextField descricaoField;
    private JTextField nomeField;
    private JPanel rootPanel;

    public static void initComponents() {
        JFrame frame = new JFrame("UpdateCategoria");
        frame.setContentPane(new UpdateCategoria().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(400, 200);
        frame.setVisible(true);
    }

    private JButton atualizarButton;
public UpdateCategoria() {
    atualizarButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent actionEvent) {
            UpdateEmBanco.updateCategoria(
                    Integer.valueOf(codigoField.getText()),
                    Integer.valueOf(estrelasField.getText()),
                    descricaoField.getText(),
                    nomeField.getText()
            );

        }
    });
}
}
