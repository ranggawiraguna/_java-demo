package com.belajar.MateriKuliah.UTS.Nomor5;

public class array {
    public static void main(String[] args) {
        String[][] dataBuku = new String[3][3];

        dataBuku[0][0] ="Java";
        dataBuku[0][1] ="Netbeans";
        dataBuku[1][0] ="PBO";
        dataBuku[1][1] ="Informatika";
        dataBuku[2][0] ="Modul";
        dataBuku[2][1] ="Praktikum";

        //for untuk mengakses baris
        for (int i = 0; i < 3; i++) {
            //for untuk mengakses kolom
            for (int j = 0; j < 2; j++) {
                System.out.print(dataBuku[i][j] + " ");
            }
            System.out.println();
        }

    }
}