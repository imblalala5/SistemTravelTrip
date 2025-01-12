import javax.swing.*;
import java.util.ArrayList;

public class CustomerManagement {
    private ArrayList<String> customers = new ArrayList<>();

    public CustomerManagement() {
        JFrame frame = new JFrame("Manajemen Pelanggan");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblName = new JLabel("Nama Pelanggan:");
        JTextField txtName = new JTextField();
        JLabel lblContact = new JLabel("No. Kontak:");
        JTextField txtContact = new JTextField();
        JButton btnAdd = new JButton("Tambah");
        JButton btnView = new JButton("Lihat Semua");

        lblName.setBounds(50, 50, 150, 30);
        txtName.setBounds(200, 50, 200, 30);
        lblContact.setBounds(50, 100, 150, 30);
        txtContact.setBounds(200, 100, 200, 30);
        btnAdd.setBounds(200, 150, 100, 30);
        btnView.setBounds(310, 150, 120, 30);

        frame.add(lblName);
        frame.add(txtName);
        frame.add(lblContact);
        frame.add(txtContact);
        frame.add(btnAdd);
        frame.add(btnView);
        frame.setLayout(null);
        frame.setVisible(true);

        btnAdd.addActionListener(e -> {
            String name = txtName.getText();
            String contact = txtContact.getText();
            if (!name.isEmpty() && !contact.isEmpty()) {
                customers.add(name + " - " + contact);
                JOptionPane.showMessageDialog(frame, "Pelanggan berhasil ditambahkan!");
                txtName.setText("");
                txtContact.setText("");
            } else {
                JOptionPane.showMessageDialog(frame, "Semua kolom harus diisi!");
            }
        });

        btnView.addActionListener(e -> {
            StringBuilder allCustomers = new StringBuilder("Daftar Pelanggan:\n");
            for (String c : customers) {
                allCustomers.append("- ").append(c).append("\n");
            }
            JOptionPane.showMessageDialog(frame, allCustomers.toString());
        });
    }
}
