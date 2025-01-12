import javax.swing.*;
import java.util.ArrayList;

public class BookingManagement {
    private ArrayList<String> bookings = new ArrayList<>();

    public BookingManagement() {
        JFrame frame = new JFrame("Pemesanan Perjalanan");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblCustomer = new JLabel("Nama Pelanggan:");
        JTextField txtCustomer = new JTextField();
        JLabel lblPackage = new JLabel("Paket Perjalanan:");
        JTextField txtPackage = new JTextField();
        JButton btnBook = new JButton("Pesan");
        JButton btnView = new JButton("Lihat Semua Pesanan");

        lblCustomer.setBounds(50, 50, 150, 30);
        txtCustomer.setBounds(200, 50, 300, 30);
        lblPackage.setBounds(50, 100, 150, 30);
        txtPackage.setBounds(200, 100, 300, 30);
        btnBook.setBounds(200, 150, 100, 30);
        btnView.setBounds(320, 150, 150, 30);

        frame.add(lblCustomer);
        frame.add(txtCustomer);
        frame.add(lblPackage);
        frame.add(txtPackage);
        frame.add(btnBook);
        frame.add(btnView);
        frame.setLayout(null);
        frame.setVisible(true);

        btnBook.addActionListener(e -> {
            String customer = txtCustomer.getText();
            String packageName = txtPackage.getText();
            if (!customer.isEmpty() && !packageName.isEmpty()) {
                bookings.add(customer + " - " + packageName);
                JOptionPane.showMessageDialog(frame, "Pesanan berhasil dicatat!");
                txtCustomer.setText("");
                txtPackage.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Semua kolom harus diisi!");
            }
        });

        btnView.addActionListener(e -> {
            StringBuilder allBookings = new StringBuilder("Daftar Pesanan:\n");
            for (String b : bookings) {
                allBookings.append("- ").append(b).append("\n");
            }
            JOptionPane.showMessageDialog(frame, allBookings.toString());
        });
    }
}