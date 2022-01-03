package com.belajar.MateriKuliah.UTS.Nomor7;

import java.io.*;

public class nilaiMHS {
    private double uas,uts;
    private int password;

    public nilaiMHS(double uas, double uts){
        this.uas = uas;
        this.uts = uts;
    }

    public static String bacaInputan(){
        String baca = " ";
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader buf = new BufferedReader(input);

        try {
            baca = buf.readLine();
        } catch (Exception e) {
            System.out.println("Error!");
        }

        return baca;
    }

    public void cetak(){
        System.out.println("Nilai UTS : " + uts);
        System.out.println("Nilai UAS : " + uas);
        System.out.println("Rata-rata : " + (uts+uas)/2);
    }

    public void getNilai(){
        System.out.print("Masukkan Password : ");
        password = Integer.parseInt(bacaInputan());
        if(password == 123){
            System.out.println("Berikut adalah nilai praktikum PBO kamu");
            cetak();
        }else{
            System.out.println("Password salah!");
        }
    }

}