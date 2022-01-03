package com.belajar.DasarProgramming;

public class D04_aritmatika_contoh {     
    public static void main(String[] args){
        int a=10, b=2,hasil1;
        float x=25, y=4,hasil2;
    
        //Penjumlahan
        System.out.println("Penjumlahan");
        hasil1 = a + b;
        hasil2 = x + y;
        System.out.println("-Hasil dari " + a + " + " + b + " adalah " + hasil1);
        System.out.println("-Hasil dari " + x + " + " + y + " adalah " + hasil2);
        System.out.println("\n");
    
        //Pengurangan
        System.out.println("Pengurangan");
        hasil1 = a - b;
        hasil2 = x - y;
        System.out.println("-Hasil dari " + a + " - " + b + " adalah " + hasil1);
        System.out.println("-Hasil dari " + x + " - " + y + " adalah " + hasil2);
        System.out.println("\n");
        
        //Perkalian
        System.out.println("Perkalian");
        hasil1 = a * b;
        hasil2 = x * y;
        System.out.println("-Hasil dari " + a + " * " + b + " adalah " + hasil1);
        System.out.println("-Hasil dari " + x + " * " + y + " adalah " + hasil2);
        System.out.println("\n");

        //Pembagian
        System.out.println("Pembagian");
        hasil1 = a / b; //variable hasil1 hanya menyimpan bilangan bulat
        hasil2 = x / y; //variable hasil2 dapat menyimpan bilangan real/koma
        System.out.println("-Hasil dari " + a + " / " + b + " adalah " + hasil1);
        System.out.println("-Hasil dari " + x + " / " + y + " adalah " + hasil2);
        System.out.println("\n");
    
        //Modulus
        System.out.println("Perkalian");
        hasil1 = a % b;
        hasil2 = x % y;
        System.out.println("-Modulus dari " + a + " / " + b + " adalah " + hasil1);
        System.out.println("-Modulus dari " + x + " / " + y + " adalah " + hasil2);
        System.out.println("\n");
    }
     
}