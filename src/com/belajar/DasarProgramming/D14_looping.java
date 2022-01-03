package com.belajar.DasarProgramming;

import java.util.*;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D14_looping {    
    public static void main(String[] args){
        String kalimat;
        int perulangan,i,j,halaman=5;
        int[] data = {77,85,69,90,95,88,85,78,72,90};
        
        Scanner inputData = new Scanner(System.in);

        System.out.print("Masukkan Kalimat\t: ");
        kalimat = inputData.next();
        System.out.print("Masukkan Perulangan\t: ");
        perulangan = inputData.nextInt();
        System.out.println();        
        
        //For do
        System.out.println("Looping For");
        //for(awal; sisa-akhir; unary;)
        for(i=0; i<perulangan; i++){
            System.out.printf("-%s\n", kalimat);
        }
        System.out.println();
    
        //For each
        System.out.println("Looping For"); i = 0;
        //for(new var : array)
        for(int nilai : data){
            System.out.printf("Data Array[%d]: %d\n", i, nilai);
            i++;
        }
        System.out.println();
        
        
        //Nested For
        System.out.println("Nested For");
        for(i=0; i<halaman; i++){
            System.out.printf("Halaman-%d\n", (i+1));
            for(j=0; j<perulangan; j++){
            System.out.printf("-%s\n", kalimat);        
            }
        }
        System.out.println();
        
        //While do
        System.out.println("While do");
        i=0;
        while(i<perulangan){
            System.out.printf("-%s\n", kalimat);
            i++;
        }
        System.out.println();
        
        //Do while
        System.out.println("Do while");
        i=0;
        do{
            System.out.printf("-%s\n", kalimat);
            i++;
        }while(i<perulangan);
        System.out.println();
        
    }
    
}
