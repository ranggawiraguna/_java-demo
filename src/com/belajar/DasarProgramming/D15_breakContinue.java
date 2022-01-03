package com.belajar.DasarProgramming;

import java.util.*;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D15_breakContinue {
    public static void main(String [] args){
     
        Scanner keyboard = new Scanner(System.in);
        int inputData,i;
        char loop;
        
        do{
            i = 0;
            System.out.println("===========================================");        
            System.out.println("     Menampilkan Deret Bilangan Ganjil");        
            System.out.println("===========================================");        
            System.out.print("[?]Masukkan akhir bilangan(Max-100) : ");
            inputData = keyboard.nextInt();
            System.out.print("[>]");        
            do{
                i++;
                if((i > inputData)||(i > 100)){ break; }            
                if((i%2)==0){ continue; }
                System.out.printf("%d\n   ", i);
            }while(true);
            System.out.println("\b\b\b===========================================");            
            System.out.print("[?]Ulangi kembali program?(y/t):");
            loop = keyboard.next().charAt(0);
            System.out.println();        
            if(loop!='y'){ return; }
        }while(true);

    }

}
