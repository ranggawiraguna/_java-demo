package com.belajar.DasarProgramming;

import java.util.Scanner;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"})
public class D04_aritmatika_test {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int a,b,hasilInt;
        float hasilFloat;
        char pilihan;
        
        while (true){
            System.out.println("==================================================");
            System.out.println("Pilihan\t: [1]Penjumlahan\n\t  [2]Pengurangan\n\t  [3]Perkalian\n\t  [4]Pembagian\n\t  [5]Modulus\n\t  [0]Keluar");
            System.out.print("Pilih\t:  ");
            pilihan = input.next().charAt(0);
            System.out.println("==================================================");

            if (pilihan == '0'){
                System.out.println("==================================================");
                System.exit(0);
            }

            else if (pilihan == '1'){
                System.out.println("PENJUMLAHAN");
                System.out.print("Masukkan angka-1\t: ");
                a = input.nextInt();
                System.out.print("Masukkabn angka-2\t: ");
                b = input.nextInt();
                hasilInt = a + b;
                System.out.printf("Hasil %d + %d\t\t: %d\n", a,b,hasilInt);
            }

            else if (pilihan == '2'){
                System.out.println("PENGURANGAN");
                System.out.print("Masukkan angka-1\t: ");
                a = input.nextInt();
                System.out.print("Masukkan angka-2\t: ");
                b = input.nextInt();
                hasilInt = a - b;
                System.out.printf("Hasil %d - %d\t\t: %d\n", a,b,hasilInt);
            }

            else if (pilihan == '3'){
                System.out.println("PERKALIAN");
                System.out.print("Masukkan angka-1\t: ");
                a = input.nextInt();
                System.out.print("Masukkan angka-2\t: ");
                b = input.nextInt();
                hasilInt = a * b;
                System.out.printf("Hasil %d * %d\t\t: %d\n", a,b,hasilInt);
            }

            else if (pilihan == '4'){
                System.out.println("PEMBAGIAN");
                System.out.print("Masukkan angka-1\t: ");
                a = input.nextInt();
                System.out.print("Masukkan angka-2\t: ");
                b = input.nextInt();
                hasilFloat = (float)a / b;
                System.out.printf("Hasil %d / %d\t\t: %.2f\n", a,b,hasilFloat);
            }

            else if (pilihan == '5'){
                System.out.println("MODULUS");
                System.out.print("Masukkan angka-1\t: ");
                a = input.nextInt();
                System.out.print("Masukkan angka-2\t: ");
                b = input.nextInt();
                hasilInt = a % b;
                System.out.printf("Hasil %d mod %d\t\t: %d\n", a,b,hasilInt);
            }

            System.out.println("==================================================\n\n\n");
        }
        
    }
     
}