import javax.swing.*;

public class TravelDashboard {
    public static void main(String[] args) {
        // Frame utama
        JFrame frame = new JFrame("Sistem Travel Trip");
        frame.setSize(600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Button navigasi
        JButton btnPackage = new JButton("Manajemen Paket Perjalanan");
        JButton btnCustomer = new JButton("Manajemen Pelanggan");
        JButton btnBooking = new JButton("Pemesanan Perjalanan");
        JButton btnReport = new JButton("Laporan Transaksi");

        // Set posisi button
        btnPackage.setBounds(180, 50, 240, 40);
        btnCustomer.setBounds(180, 110, 240, 40);
        btnBooking.setBounds(180, 170, 240, 40);
        btnReport.setBounds(180, 230, 240, 40);

        // Tambahkan ke frame
        frame.add(btnPackage);
        frame.add(btnCustomer);
        frame.add(btnBooking);
        frame.add(btnReport);
        frame.setLayout(null);
        frame.setVisible(true);

        // Event listener untuk navigasi
        btnPackage.addActionListener(e -> new PackageManagement());
        btnCustomer.addActionListener(e -> new CustomerManagement());
        btnBooking.addActionListener(e -> new BookingManagement());
        btnReport.addActionListener(e -> new ReportView());
    }
}
