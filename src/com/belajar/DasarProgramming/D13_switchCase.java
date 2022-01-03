package com.belajar.DasarProgramming;

import java.util.*; 

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D13_switchCase {    
    public static void main(String[] args){
        Scanner inputData = new Scanner(System.in);
        int a,b,c=0;
        float d=0;
        char op;
        
        System.out.println("Contoh Perhitungan\t: 1 + 2");        
        System.out.print("Masukkan Perhitungan\t: ");
        a = inputData.nextInt(); 
        op = inputData.next().charAt(0); 
        b = inputData.nextInt(); 
        
        switch(op){
            case '+' :
                c = a + b;
                break;
            
            case '-' :
                c = a - b;
                break;
                
            case '*' :
                c = a * b;
                break;
            
            case '/' :
                d = (float)a / b;
                break;
                
            case '%' :
                c = a / b;
                break;


            default :
                System.out.println("Operator tidak ditemukan!");
                break;
        }
        
        if(op=='/'){
            System.out.printf("Hasil Perhitungan\t: %f\n", d);
        }else{
            System.out.printf("Hasil Perhitungan\t: %d\n", c);
        }
    
    }
}

