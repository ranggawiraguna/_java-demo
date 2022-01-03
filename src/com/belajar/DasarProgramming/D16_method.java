package com.belajar.DasarProgramming;

import java.util.Scanner;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D16_method{    
    public static void main(String[] args){
    Scanner keyboard = new Scanner(System.in) ;
    
    int s,l,v;
    
    System.out.print("Masukkan Sisi Kubus\t: ");
    s = keyboard.nextInt();
    l = luasPermukaan(s);
    v = volume(s);
    print(v,l);
    }
    
    private static int luasPermukaan(int sisi){
        int hasil = (sisi*sisi) * 6;
        return hasil;
    }
    
    private static int volume(int sisi){
        int hasil = sisi*sisi*sisi;
        return hasil;
    }
    
    private static void print(int volume, int luas){
        System.out.printf("Luas Permukaan Kubus\t: %d\n", luas);
        System.out.printf("Volume Kubus\t\t: %d\n\n", volume);

    }
}