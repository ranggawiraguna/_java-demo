package com.belajar.DasarProgramming;

import java.util.Scanner;
import java.lang.String;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D22_StringBuilder {    
    public static void main(String[]  args){
        Scanner keyboard = new Scanner(System.in);
        
        StringBuilder input, teks;
        
        //Karakteristik
        garis();
        System.out.println("Karakteristik StringBuilder");
        garis();
        System.out.print("Masukkan kata = ");
        input = new StringBuilder(keyboard.nextLine());
        System.out.println();
        print("input", input);

        teks = new StringBuilder("Belajar pemrograman");
        System.out.println();
        print("teks ", teks);        
        System.out.println();
        
        //varStringBuilder.append(teks)
        garis();        
        System.out.println("varStringBuilder.append(teks)");
        garis();
        System.out.print("Masukkan kata tambahan = ");
        input.append(" " + keyboard.nextLine());       
        
        System.out.println();        
        print("input", input);
        System.out.println();
        teks.append(" JAVA");
        print("teks ", teks);
        System.out.println();
        
        //varStringBuilder.insert(indeks, teks)
        garis();        
        System.out.println("varStringBuilder.insert(indeks, teks)");
        garis();
        
        input.insert(0, "Lu abis ngetik ");
        print("input", input);
        System.out.println();
        teks.insert(8, "bahasa ");
        print("teks ", teks);
        System.out.println();
        
        //varStringBuilder.delete(awal, --akhir)
        garis();        
        System.out.println("varStringBuilder.delete(awal,--akhir)");
        garis();

        input.delete(0, 14);
        print("input", input);
        System.out.println();
        teks.delete(8, 15);
        print("teks ", teks);
        System.out.println();        
        
        //varStringBuilder.setCharAt(indeks, newChar)
        garis();        
        System.out.println("varStringBuilder.setCharAt(indeks, char)");
        garis();
        
        input.setCharAt(3, 'a');
        print("input", input);
        System.out.println();        
        teks.setCharAt(22, 'W');
        print("teks ", teks);        
        System.out.println();        
        
        //StringBuilder casting to String
        garis();        
        System.out.println("varStringBuilder.toString()");
        garis();

        String kalimat1 = input.toString();
        String kalimat2 = teks.toString();        
        
        print("kalimat1 = ", kalimat1);
        print("kalimat2 = ", kalimat2);
        System.out.println();        
        garis();
        
    }
    
    private static void print(String nama, StringBuilder data){
        System.out.println(nama + " = " + data);
        System.out.println("panjang = " + data.length());
        System.out.println("kapasitas = " + data.capacity());
        System.out.println("address = " + Integer.toHexString(System.identityHashCode(data)));        
    }

    private static void print(String nama, String data){
        System.out.println(nama + " = " + data + " || " + Integer.toHexString(System.identityHashCode(data)));
    }
    
    private static void garis(){
        for(int i=0; i<50; i++){ System.out.print("-"); }
        System.out.println();
    }

}
