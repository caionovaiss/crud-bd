package view.Categoria;

import br.com.SistemaHotelaria.Aplicacao.RemoveEmBanco;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteCategoria {
    private JTextField codigoField;
    private JPanel rootPanel;
    private JButton excluirButton;

    public static void initComponents() {
        JFrame frame = new JFrame("DeleteCategoria");
        frame.setContentPane(new DeleteCategoria().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();

        frame.setSize(300, 100);
        frame.setVisible(true);
    }

    public DeleteCategoria() {
        excluirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                RemoveEmBanco.removeCategoria(
                        Integer.valueOf(codigoField.getText())
                );
            }
        });
    }
}
