package com.belajar.MateriKuliah.GUI.Testeran;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

class InputDataPenjualan extends JFrame {
    private static final long serialVersionUID = 1L;
    TextField inputNamaCustomer, inputNamaPesanan, inputJumlahPesanan, inputTanggalPesanan;
    JLabel notif, title, titleNamaCustomer, titleNamaPesanan, titleJumlahPesanan, titleTanggalPesanan;
    Button save;
    Font fontStyle = null;

    InputDataPenjualan() {
        try {
            fontStyle = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("JENNASUE.TTF"));
        } catch (FontFormatException | IOException e1) {
            e1.printStackTrace();
        }

        setSize(800, 600);

        try {
            this.setContentPane(new JLabel(new ImageIcon(
                    ImageIO.read(new File(".\\src\\com\\belajar\\MateriKuliah\\GUI\\Testeran\\Home.png")))));
        } catch (final IOException e1) {
            e1.printStackTrace();
        }

        // create componen
        title = new JLabel("Input Data Penjualan");
        title.setFont(fontStyle.deriveFont(Font.BOLD, 48f));
        title.setSize(title.getPreferredSize());
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);

        titleNamaCustomer = new JLabel("Nama Customer : ");
        titleNamaCustomer.setBounds(20, 70, 260, 20);
        inputNamaCustomer = new TextField();
        inputNamaCustomer.setBounds(20, 90, 260, 20);

        titleNamaPesanan = new JLabel("Nama Pesanan : ");
        titleNamaPesanan.setBounds(20, 120, 260, 20);
        inputNamaPesanan = new TextField();
        inputNamaPesanan.setBounds(20, 140, 260, 20);

        titleJumlahPesanan = new JLabel("Jumlah Pesanan  : ");
        titleJumlahPesanan.setBounds(20, 170, 260, 20);
        inputJumlahPesanan = new TextField();
        inputJumlahPesanan.setBounds(20, 190, 260, 20);

        titleTanggalPesanan = new JLabel("Tanggal Pesanan : ");
        titleTanggalPesanan.setBounds(20, 220, 260, 20);
        inputTanggalPesanan = new TextField();
        inputTanggalPesanan.setBounds(20, 240, 260, 20);

        notif = new JLabel("");
        notif.setBounds(50, 310, 170, 20);

        save = new Button("Save");
        save.setBounds(100, 280, 100, 30);
        save.addActionListener(new ActionListener() { // tambah listener
            @Override
            public void actionPerformed(final ActionEvent e) {
                if (inputNamaCustomer.getText().toString().length() != 0
                        && inputNamaPesanan.getText().toString().length() != 0
                        && inputJumlahPesanan.getText().toString().length() != 0
                        && inputTanggalPesanan.getText().toString().length() != 0) {
                    final String biodata = "Nama Customer   : " + inputNamaCustomer.getText().toString() + "\n"
                            + "Nama Pesanan    : " + inputNamaPesanan.getText().toString() + "\n" + "Jumlah Pesanan  : "
                            + inputJumlahPesanan.getText().toString() + "\n" + "Tanggal Pesanan : "
                            + inputTanggalPesanan.getText().toString() + "\n";

                    try {
                        BufferedWriter output;
                        final File file = new File(System.getProperty("user.home") + "/Downloads/DataPenjualan.txt");
                        output = new BufferedWriter(new FileWriter(file));
                        output.write(biodata);
                        output.close();
                        notif.setText("Data berhasil disimpan pada folder downloads");
                        notif.setBounds(20, 310, 280, 20);
                    } catch (final IOException ex) {
                        ex.printStackTrace();
                    }
                } else {
                    notif.setText("Lengkapi formulir terlebih dahulu!");
                    notif.setBounds(50, 310, 200, 20);
                }
            }
        });

        add(title);
        add(titleNamaCustomer);
        add(inputNamaCustomer);
        add(titleNamaPesanan);
        add(inputNamaPesanan);
        add(titleJumlahPesanan);
        add(inputJumlahPesanan);
        add(titleTanggalPesanan);
        add(inputTanggalPesanan);
        add(save);
        add(notif);
    }

    public static void main(final String args[]) {
        final JFrame frame = new InputDataPenjualan();
        frame.setTitle("Aplikasi Cobaan");
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
