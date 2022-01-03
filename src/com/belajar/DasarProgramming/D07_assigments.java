package com.belajar.DasarProgramming;

public class D07_assigments {
    public static void main(String[] args){
        int nilai = 20;
    
        //Penjumlahan
        System.out.println("Assigment penjumlahan");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai += 10; // nilai = nilai + 10;
        System.out.println("-Nilai assigment +=10\t: " + nilai + "\n");

        //Pengurangan
        System.out.println("Assigment pengurangan");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai -= 5; // nilai = nilai - 5;
        System.out.println("-Nilai assigment -=5\t: " + nilai + "\n");

        //Perkalian
        System.out.println("Assigment perkalian");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai *= 4; // nilai = nilai * 4;
        System.out.println("-Nilai assigment *=4\t: " + nilai + "\n");

        //Pembagian
        System.out.println("Assigment pembagian");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai /= 20; // nilai = nilai / 20;
        System.out.println("-Nilai assigment /=20\t: " + nilai + "\n");

        //Modulus
        System.out.println("Assigment modulus");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai %= 2; // nilai = nilai % 2;
        System.out.println("-Nilai assigment %=2\t: " + nilai + "\n");

        //Gabungan
        System.out.println("Assigment Gabungan");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai += 3 - 2; // nilai = nilai + (3 - 2);
        System.out.println("-Nilai assigment +=3-2\t: " + nilai + "\n");
        System.out.printf("-Nilai\t\t\t: %d\n", nilai);
        nilai += 2; nilai %= 4; // nilai = (nilai + 2) % 4;
        System.out.println("-Nilai assigment += %=\t: " + nilai + "\n");

    }
     
}