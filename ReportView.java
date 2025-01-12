import javax.swing.*;
import java.util.ArrayList;

public class ReportView {
    private ArrayList<String> reports = new ArrayList<>();

    public ReportView() {
        JFrame frame = new JFrame("Laporan Transaksi");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel lblTitle = new JLabel("Laporan Transaksi:");
        JTextArea txtReports = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(txtReports);
        JButton btnLoad = new JButton("Muat Laporan");

        lblTitle.setBounds(50, 20, 200, 30);
        scrollPane.setBounds(50, 60, 500, 250);
        btnLoad.setBounds(50, 320, 150, 30);

        txtReports.setEditable(false);
        frame.add(lblTitle);
        frame.add(scrollPane);
        frame.add(btnLoad);
        frame.setLayout(null);
        frame.setVisible(true);

        // Event listener untuk tombol "Muat Laporan"
        btnLoad.addActionListener(e -> {
            if (reports.isEmpty()) {
                // Jika tidak ada laporan, tambahkan data dummy
                reports.add("Pelanggan: John Doe, Paket: Bali Holiday, Harga: Rp 5,000,000");
                reports.add("Pelanggan: Jane Smith, Paket: Lombok Getaway, Harga: Rp 3,000,000");
            }

            // Tampilkan laporan dalam TextArea
            StringBuilder reportText = new StringBuilder();
            for (String report : reports) {
                reportText.append(report).append("\n");
            }
            txtReports.setText(reportText.toString());
        });
    }
}
