package com.belajar.DasarProgramming;

import java.util.Scanner;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner & 'local variable is not used'
@SuppressWarnings({"resource","unused"}) 
public class D18_iterasi {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int a,b,c;

        System.out.println("[*]FIBONACCI");        
        System.out.print("[-]Masukkan Deret ke\t: ");
        a = keyboard.nextInt();
        fibo(a);
                
        System.out.println();        
        
        System.out.println("[*]PANGKAT");        
        System.out.print("[-]Masukkan Angka\t: ");
        a = keyboard.nextInt();
        System.out.print("[-]Masukkan Pangkat\t: ");
        b = keyboard.nextInt();
        pangkat(a,b);
    
        System.out.println();
    
        System.out.println("[*]FAKTORIAL");        
        System.out.print("[-]Masukkan Angka\t: ");
        a = keyboard.nextInt();
        faktorial(a);

        System.out.println();        
        
    }
    
    private static void fibo(int x){
        int[] array;
        array = new int[x+1];
        
        array[0]=0;
        array[1]=1;

        for(int i=2; i<=x; i++){
            array[i] = array[i-1] + array[i-2];
        }
        System.out.print("[-]Deret Fibonacci\t: ");        
        for(int nilai : array){
            System.out.printf("%d ", nilai);
        }
        System.out.println("\n[-]Hasil Fibonacci\t: " + array[x]);
    }

    private static void pangkat(int x, int y){
        int z;

        System.out.print("[-]Operasi Hitung\t: ");

        if(y==0){
            z = 1;
        }else{
           z = x; 
           System.out.printf("%d", x);            
           for(int i=1; i<y; i++){
               System.out.printf(" * %d", x);
               z *= x;
            }
        }

        System.out.println("\n[-]Hasil Pangkat\t: " + z);           
           
    }
    
    private static void faktorial(int x){
        int z=x;

        System.out.print("[-]Operasi Hitung\t: " + x);
        
        
        for(int i=x-1; i>=1; i--){
            z *= i;
            System.out.printf(" * %d", i);            
        }
 
        System.out.println("\n[-]Hasil Faktorial\t: " + z);

    }
}
