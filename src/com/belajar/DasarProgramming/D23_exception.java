package com.belajar.DasarProgramming;

import java.io.FileInputStream;
import java.io.IOException; //try,catch,finally
import java.util.InputMismatchException;
import java.io.FileNotFoundException;
import java.lang.ArrayIndexOutOfBoundsException;
import java.util.Scanner; //Scanner input user

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner & 'local variable is not used'
@SuppressWarnings({"resource","unused"}) 
public class D23_exception {
    public static void main(String[] args){
    
        Scanner input = new Scanner(System.in);
        boolean error = false;
        int angka=0, angka1=0, angka2=0, index=0, array[]={6,3,8,9,1};
        FileInputStream file;
        
        //Exception1
        try{
            error = false;
            System.out.print("Masukkan Angka : ");
            angka = input.nextInt();        
        }catch(Exception e){ //java.io.IOException || All Exception
            error = true;
            input.nextLine();        
            System.err.println("ERROR RUNTIME : " + e + "\n");
        }finally{
            if(!error){
                System.out.printf("Input yang dimasukkan benar!\n\n");
            }
        }        

        //Exception2
        try{
            error = false;
            System.out.print("Masukkan Angka : ");
            angka1 = input.nextInt();        
        }catch(InputMismatchException e){ //java.util.InputMismatchException
            error = true;
            input.nextLine();        
            System.err.println("ERROR RUNTIME : " + e + "\n");
        }finally{
            if(!error){
                System.out.printf("Input yang dimasukkan benar!\n\n");
            }
        }        
        
        //Exception2
        try{
            error = false;
            System.out.print("Masukkan Indeks yang dicari : ");
            index = input.nextInt();
            angka2 = array[index];
        }catch(ArrayIndexOutOfBoundsException e){ //java.lang.ArrayIndexOutOfBoundsException
            error = true;
            System.err.println("ERROR RUNTIME : " + e + "\n");
        }finally{
            if(!error){
                System.out.printf("Nilai pada array tersebut adalah %d\n\n", angka2);
            }
        }
        
        //exception3
        try{
            error = false;
            System.out.print("Masukkan namafile.format yang dicari : ");
            input.nextLine(); String buffer = input.nextLine();
            file = new FileInputStream(buffer);
        }catch(FileNotFoundException e){
            error = true;
            System.err.println("ERROR RUNTIME : " + e + "\n");
        }finally{
            if(!error){
                System.out.println("Data file ditemukan!\n");
            }
        }
        
        System.out.println("Selesai");
        
    }
       
    
}
