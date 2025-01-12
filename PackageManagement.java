import javax.swing.*;
import java.util.ArrayList;

public class PackageManagement {
    private ArrayList<String> packages = new ArrayList<>();

    public PackageManagement() {
        JFrame frame = new JFrame("Manajemen Paket Perjalanan");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblName = new JLabel("Nama Paket:");
        JTextField txtName = new JTextField();
        JLabel lblPrice = new JLabel("Harga (Rp):");
        JTextField txtPrice = new JTextField();
        JLabel lblDuration = new JLabel("Durasi (hari):");
        JTextField txtDuration = new JTextField();
        JButton btnAdd = new JButton("Tambah");
        JButton btnView = new JButton("Lihat Semua Paket");

        lblName.setBounds(50, 50, 150, 30);
        txtName.setBounds(200, 50, 300, 30);
        lblPrice.setBounds(50, 100, 150, 30);
        txtPrice.setBounds(200, 100, 300, 30);
        lblDuration.setBounds(50, 150, 150, 30);
        txtDuration.setBounds(200, 150, 300, 30);
        btnAdd.setBounds(200, 200, 100, 30);
        btnView.setBounds(320, 200, 150, 30);

        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblPrice);
        frame.add(txtPrice);
        frame.add(lblDuration);
        frame.add(txtDuration);
        frame.add(btnAdd);
        frame.add(btnView);
        frame.setLayout(null);
        frame.setVisible(true);

        btnAdd.addActionListener(e -> {
            String name = txtName.getText();
            String price = txtPrice.getText();
            String duration = txtDuration.getText();
            if (!name.isEmpty() && !price.isEmpty() && !duration.isEmpty()) {
                packages.add(name + " - Rp" + price + " - " + duration + " hari");
                JOptionPane.showMessageDialog(frame, "Paket berhasil ditambahkan!");
                txtName.setText("");
                txtPrice.setText("");
                txtDuration.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Semua kolom harus diisi!");
            }
        });

        btnView.addActionListener(e -> {
            StringBuilder allPackages = new StringBuilder("Daftar Paket:\n");
            for (String p : packages) {
                allPackages.append("- ").append(p).append("\n");
            }
            JOptionPane.showMessageDialog(frame, allPackages.toString());
        });
    }
}
