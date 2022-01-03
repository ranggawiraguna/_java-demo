package com.belajar.DasarProgramming;

import java.util.*;
import java.util.Arrays;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner & 'local variable is not used'
@SuppressWarnings({"resource","unused"}) 
public class D19_array1D {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        
        int[] array1, array11, array2, array3, array4, array5;
        int[] gabungan1, gabungan2; //TUGAS
        int value,indeks;
        boolean key;
        
        array1  = new int[5];
        array11 = new int[5];
        array2  = new int[5];
        array3  = new int[5];
        array4  = new int[5];
        array5  = new int[5];
        
        System.out.println("[*]MENGISI ELEMEN ARRAY");
        for(int i=0; i<array1.length; i++){
            System.out.printf("[-]Masukkan Nilai[%d] : ", (i+1));
            array1[i] = keyboard.nextInt();
        }
        System.out.println();
        
        System.out.println("[*]MENYATUKAN DUA BUAH ARRAY");
        array11 = array1;
        System.out.print("[1]Data array1    : "); printIsi(array1);
        System.out.println("[-]Alamat array1  : " + array1); 
        System.out.print("[2]Data array11   : "); printIsi(array11);
        System.out.println("[-]Alamat array11 : " + array11);         
        System.out.println();        

        System.out.println("[*]MENYALIN ISI ARRAY KE ARRAY LAIN");
        array2 = Arrays.copyOf(array1, 3); //meng-Copy 3elemen array1
        array3 = Arrays.copyOfRange(array1, 2, 5); //meng-Copy array1 mulai dari indeks[2]-[3]~([4]gak dianggep)
        System.out.print("[1]Data array1    : "); printIsi(array1);
        System.out.println("[-]Alamat array1  : " + array1); 
        System.out.print("[2]Data array2    : "); printIsi(array2);
        System.out.println("[-]Alamat array2  : " + array2);         
        System.out.print("[3]Data array3    : "); printIsi(array3);
        System.out.println("[-]Alamat array3  : " + array3);         
        System.out.println();        

        System.out.println("[*]MENGISI SEMUA ELEMEN ARRAY DENGAN NILAI YANG SAMA");
        Arrays.fill(array4, 80);
        System.out.print("[1]Data array4    : "); printIsi(array4);
        System.out.println("[-]Alamat array4  : " + array4); 
        System.out.println();        

        System.out.println("[*]MEMBANDINGKAN KEDUA DATA ARRAY");
        System.out.print("[1]Data array   : "); printIsi(array1); 
        System.out.print("                : "); printIsi(array11); 
        key = Arrays.equals(array1, array11);
        cekData(key);
        System.out.print("[2]Data array   : "); printIsi(array2); 
        System.out.print("                : "); printIsi(array3); 
        key = Arrays.equals(array3, array4);
        cekData(key);
        System.out.println();                
        
        System.out.println("[*]MENGURUTKAN DATA PADA ARRAY");
        System.out.print("[1]Data array1           : "); printIsi(array1);        
        Arrays.sort(array1);
        System.out.print("[2]Data array1(sort)     : "); printIsi(array1);
        System.out.println("[-]Alamat array1         : " + array1); 
        System.out.println();        

        System.out.println("[*]MENGURUTKAN REVERSE DATA PADA ARRAY");
        System.out.print("[1]Data array1 (sort)    : "); printIsi(array1);        
        sortReverse(array1);
        System.out.print("[2]Data array1 (reverse) : "); printIsi(array1);
        System.out.println("[-]Alamat array1         : " + array1); 
        System.out.println();                
        
        System.out.println("[*]MENCARI DATA PADA ARRAY");
        Arrays.sort(array1);
        System.out.print("[1]Data array1(sort)         : "); printIsi(array1);
        System.out.println("[-]Alamat array1             : " + array1);
        System.out.print("[2]Masukkan Data Yang dicari : ");
        value = keyboard.nextInt();
        indeks = Arrays.binarySearch(array1, value);
        cariData(indeks);
        System.out.println();        

        
    }
    
    private static void printIsi(int[] dataArray){
        System.out.println(Arrays.toString(dataArray));
    }

    private static void cekData(boolean key){
        if(key==true){
            System.out.println("[-]Perbandingan : Data Sama");
        }else{
            System.out.println("[-]Perbandingan : Data Berbeda");            
        }
    }

    private static void cariData(int key){
        if(key==0){
            System.out.println("[-]Pencarian                 : Data tidak ditemukan");
        }else{
            System.out.println("[-]Pencarian                 : Data ditemukan pada indeks ke-" + key);
        }
    }    
    
    private static void sortReverse(int dataArray[]){
        int temp;
        for(int i=0; i<(dataArray.length/2); i++){
            temp = dataArray[i];
            dataArray[i] = dataArray[(dataArray.length-1) - i];
            dataArray[(dataArray.length-1) - i] = temp;
        }
    }
    
}
