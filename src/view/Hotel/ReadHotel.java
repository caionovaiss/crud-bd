package view.Hotel;

import javax.swing.*;

public class ReadHotel extends JFrame {
    private JTable hotelTable;
    private JPanel panel1;

    HotelTableModel hotelModel = new HotelTableModel();

    public ReadHotel() {
        hotelTable.setModel(hotelModel);
    }
    public static void initComponents() {
        JFrame frame = new JFrame("ReadHotel");
        frame.setContentPane(new ReadHotel().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(1500, 200);

        frame.setVisible(true);
    }

}
