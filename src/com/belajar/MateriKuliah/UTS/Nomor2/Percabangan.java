package com.belajar.MateriKuliah.UTS.Nomor2;

public class Percabangan {
    public static void main(String[] args) {
        int nilai = 85;
        if(nilai >= 80){
            System.out.println("Nilai " + nilai + " Mendapatkan indeks A");
        }else if(nilai >= 68){
            System.out.println("Nilai " + nilai + " Mendapatkan indeks B");
        }else if(nilai >= 50){
            System.out.println("Nilai " + nilai + " Mendapatkan indeks C");
        }else if(nilai >= 40){
            System.out.println("Nilai " + nilai + " Mendapatkan indeks D");
        }else{
            System.out.println("Nilai " + nilai + " Mendapatkan indeks E");
        }
    }
}