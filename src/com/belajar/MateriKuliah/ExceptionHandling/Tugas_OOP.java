package com.belajar.MateriKuliah.ExceptionHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Tugas_OOP {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        float[] daftarAngka = null;
        Object rata = null;

        try {
            System.out.println("=====================================================================");
            System.out.println("                    MENGHITUNG RATA-RATA");
            System.out.print("Masukkan Banyak Angka : ");
            daftarAngka = new float[inputData.nextInt()];
            System.out.println("=====================================================================");

            float jumlah = 0;
            for (int i = 0; i < daftarAngka.length; i++) {
                System.out.print("Masukkan Angka-" + (i + 1) + " : ");
                daftarAngka[i] = inputData.nextFloat();
                jumlah = jumlah + daftarAngka[i];
            }

            System.out.println();

            rata = (float) jumlah / daftarAngka.length;
        } catch (NegativeArraySizeException e) {
            System.err.println("\n[!]Terjadi kesalahan karena : " + e.toString());
        } catch (NumberFormatException e) {
            System.err.println("\n[!]Terjadi kesalahan karena : " + e.toString());
        } finally {
            inputData.close();

            try {
                // System.out.println("Rata-rata : " + (String)rata);
                System.out.println("Rata-rata : " + Float.toString((Float) rata));
            } catch (ClassCastException e) {
                System.err.println("\n[!]Terjadi kesalahan karena : " + e.toString());
            } catch (NullPointerException e) {
                System.err.println("\n[!]Terjadi kesalahan karena : " + e.toString());
            }

            if (rata != null) {
                FileWriter fileWriter;
                String fileName = "./src/com/belajar/MateriKuliah/ExceptionHandling/history_perhitungan.txt";
                String dataInput = "=====================================================================" + "\n"
                        + "                         MENGHITUNG RATA-RATA                        " + "\n"
                        + "=====================================================================";

                for (int i = 0; i < daftarAngka.length; i++) {
                    dataInput = dataInput + "\n" + "[>]Angka-" + (i + 1) + " : " + daftarAngka[i];
                }

                dataInput = dataInput + "\n\n" + "[>]Rata   : " + Float.toString((Float) rata) + "\n"
                        + "=====================================================================";

                try {
                    FileInputStream fileInputStream = new FileInputStream(new File(fileName));
                    int i = fileInputStream.read();

                    fileWriter = new FileWriter(fileName, true);
                    BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
                    while (i != -1) {
                        bufferedWriter.write((char) i);

                        // Reads next byte from the file
                        i = fileInputStream.read();
                    }

                    fileWriter.write("\n\n" + dataInput);
                    fileWriter.close();
                    System.out.println("\n[!]Pesan Program            :  File telah berhasil ditambahkan!");
                } catch (IOException e) {
                    System.err.println("\n[!]Terjadi kesalahan karena : " + e.toString());

                    try {
                        fileWriter = new FileWriter(fileName);
                        fileWriter.write(dataInput);
                        fileWriter.close();
                    } catch (IOException e2) {
                        e2.printStackTrace();
                    } finally {
                        System.out.println("[!]Pesan Program            :  File telah dibuat baru!");
                    }
                }
            }
        }
    }
}
