package com.belajar.DasarProgramming;

import java.util.Scanner;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D11_ternary {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
    
        int jawab;
        String koreksi; 
    
        System.out.print("Berapa hasil dari 13 x 14 ?\nJawab   : ");
        jawab = keyboard.nextInt();
        koreksi = (jawab==182) ? "Jawaban Anda Benar" : "Jawaban Anda Salah";
        System.out.printf("Koreksi : %s\n\n", koreksi);

        System.out.print("Berapa hasil dari 169 / 13 ?\nJawab   : ");
        jawab = keyboard.nextInt();
        koreksi = (jawab==13) ? "Jawaban Anda Benar" : "Jawaban Anda Salah";
        System.out.printf("Koreksi : %s\n\n", koreksi);

        System.out.print("Berapa hasil dari 311 + 93 ?\nJawab   : ");
        jawab = keyboard.nextInt();
        koreksi = (jawab==404) ? "Jawaban Anda Benar" : "Jawaban Anda Salah";
        System.out.printf("Koreksi : %s\n\n", koreksi);

        System.out.print("Berapa hasil dari 267 + 39 ?\nJawab   : ");
        jawab = keyboard.nextInt();
        koreksi = (jawab==228) ? "Jawaban Anda Benar" : "Jawaban Anda Salah";
        System.out.printf("Koreksi : %s\n\n", koreksi);

    }
    
}
