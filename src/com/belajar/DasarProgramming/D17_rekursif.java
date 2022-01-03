package com.belajar.DasarProgramming;

import java.util.Scanner;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D17_rekursif {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);
        
        int a,b,c;

        System.out.println("[*]FIBONACCI");        
        System.out.print("[-]Masukkan Deret ke\t: ");
        a = keyboard.nextInt();
        System.out.println("[-]Hasil Fibonacci\t: " + fibo(a));

        System.out.println();        
        
        System.out.println("[*]PANGKAT");        
        System.out.print("[-]Masukkan Angka\t: ");
        a = keyboard.nextInt();
        System.out.print("[-]Masukkan Pangkat\t: ");
        b = keyboard.nextInt();
        System.out.print("[-]Operasi Hitung\t:");
        c = pangkat(a,b);
        System.out.println("[-]Hasil Pangkat\t: " + c);
    
        System.out.println();
    
        System.out.println("[*]FAKTORIAL");        
        System.out.print("[-]Masukkan Angka\t: ");
        a = keyboard.nextInt();
        System.out.print("[-]Operasi Hitung\t:");
        c = faktorial(a);
        System.out.println("[-]Hasil Faktorial\t: " + c);
    
    }
    
    private static int fibo(int x){
        
        if((x==1)||(x==0)){
            return x;
        }else{
            return fibo(x-1) + fibo(x-2);
        }
        
    }

    private static int pangkat(int x, int y){
        if(y==0){
            return 1;
        }else if(y==1){
            System.out.printf(" %d\n", x);
            return x;
        }else{
            System.out.printf(" %d *", x);
            return x * pangkat(x,y-1);
        }
        
    }
    
    private static int faktorial(int x){
        if((x==1)||(x==0)){
            System.out.printf(" %d\n", x);
            return x;
        }else{
            System.out.printf(" %d *", x);
            return x * faktorial(x-1);
        }
        
    }
    
}
