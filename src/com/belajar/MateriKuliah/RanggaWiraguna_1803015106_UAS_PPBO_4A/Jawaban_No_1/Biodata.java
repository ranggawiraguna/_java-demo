package com.belajar.MateriKuliah.RanggaWiraguna_1803015106_UAS_PPBO_4A.Jawaban_No_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Biodata {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setLayout(new BorderLayout());
        frame.setSize(100, 100);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonShow = new JButton("SHOW BIODATA");
        buttonShow.addActionListener(new ActionListener() { // tambah listener
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = "Rangga Wiraguna";
                String nim = "1803015106";
                String kelas = "Praktikum Pemrograman Berorientasi Objek 4A";

                String biodata = "Nama  : " + nama + "\n" + "NIM   : " + nim + "\n" + "Kelas : " + kelas;

                JOptionPane.showMessageDialog(null, biodata, "Biodata", JOptionPane.PLAIN_MESSAGE);
            }
        });

        frame.add(buttonShow, BorderLayout.CENTER);        
    }
}