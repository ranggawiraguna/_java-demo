package com.belajar.DasarProgramming;

import java.util.Scanner;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner & 'local variable is not used'
@SuppressWarnings({"resource","unused"}) 
public class D03_Scanner {
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        byte angkaByte;
        short angkaShort; 
        int angkaInt;
        long angkaLong;
        float angkaFloat;
        double angkaDouble;
        char huruf;
        String kata;
        String kalimat;

        System.out.print("Masukkan Angka Bilangan Bulat(byte)\t:  ");
        angkaByte = inputData.nextByte();

        System.out.print("Masukkan Angka Bilangan Bulat(short)\t:  ");
        angkaShort = inputData.nextShort();

        System.out.print("Masukkan Angka Bilangan Bulat(int)\t:  ");
        angkaInt = inputData.nextInt();
        
        System.out.print("Masukkan Angka Bilangan Real(float)\t:  ");
        angkaFloat = inputData.nextFloat();

        System.out.print("Masukkan Angka Bilangan Real(double)\t:  ");
        angkaDouble = inputData.nextDouble();

        System.out.print("Masukkan Huruf\t\t\t\t:  ");
        huruf = inputData.next().charAt(0); //charAt(indeks) - indeks = indeks char yang mau diambil

        System.out.print("Masukkan Kata\t\t\t\t:  ");
        kata = inputData.next();

        System.out.print("Masukkan Kalimat\t\t\t:  ");
        //Trik for get input kalimat
        inputData.nextLine();        
        kalimat = inputData.nextLine();
        
//        Runtime.getRuntime().exec("cls");
        
        System.out.println("\nData Yang dimasukkan :");
        System.out.println(angkaByte);
        System.out.println(angkaShort);
        System.out.println(angkaInt);
        System.out.println(angkaFloat);
        System.out.println(angkaDouble);        
        System.out.println(huruf);
        System.out.println(kata);
        System.out.println(kalimat);
    }
    
}