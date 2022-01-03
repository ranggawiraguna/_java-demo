package com.belajar.DasarProgramming;

import java.util.*;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner & 'local variable is not used'
@SuppressWarnings({"resource","unused"})
public class D12_selectionIf {    
    public static void main(String[] args){
        int pil,pil2,harga=0,total,banyak;
        String jus;
        
        Scanner inputData = new Scanner(System.in);

        System.out.println("ANEKA JUS BOONGAN");
        System.out.println("Menu\t: [1]Alpukat\n\t  [2]Mangga\n\t  [3]Jeruk\n\t  [4]Jambu\n\t  {5]Air");
        System.out.print("Pilih\t:  ");
        pil = inputData.nextInt();
        System.out.println("\nUkuran\t: [1]Besar\n\t  [2]Sedang\n\t  [3]Kecil");
        System.out.print("Pilih\t:  ");
        pil2 = inputData.nextInt();
        System.out.print("\nBanyak\t:  ");
        banyak = inputData.nextByte();
        System.out.println("");
        
        if(pil==1){
            jus = "Alpukat" ; 
            if(pil2==1){
                harga = 15000;
            }else if(pil2==2){
                harga = 13000;
            }else if(pil2==3){
                harga = 10000;
            }else{
                System.out.println("Ukuran tidak tersedia!!!");
            }   
        }else if(pil==2){
            jus = "Mangga" ; 
            if(pil2==1){
                harga = 15000;
            }else if(pil2==2){
                harga = 12000;
            }else if(pil2==3){
                harga = 9000;
            }else{
                System.out.println("Ukuran tidak tersedia!!!");
            }   
        }else if(pil==3){
            jus = "Jeruk" ; 
            if(pil2==1){
                harga = 14000;
            }else if(pil2==2){
                harga = 12000;
            }else if(pil2==3){
                harga = 9000;
            }else{
                System.out.println("Ukuran tidak tersedia!!!");
            }   
        }else if(pil==4){
            jus = "Jambu" ; 
            if(pil2==1){
                harga = 14000;
            }else if(pil2==2){
                harga = 11000;
            }else if(pil2==3){
                harga = 8000;
            }else{
                System.out.println("Ukuran tidak tersedia!!!");
            }   
        }else if(pil==5){
            jus = "Air" ; 
            if(pil2==1){
                harga = 5000;
            }else if(pil2==2){
                harga = 3000;
            }else if(pil2==3){
                harga = 2000;
            }else{
                System.out.println("Ukuran tidak tersedia!!!");
            }   
        }else{
            System.out.println("Pilihan Menu tidak ada!!!");
        }
        
        total = banyak * harga;
        System.out.printf("Total biaya pembelian adalah Rp.%d\n", total);
    }

}
