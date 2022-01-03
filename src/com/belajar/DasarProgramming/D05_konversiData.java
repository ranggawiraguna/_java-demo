package com.belajar.DasarProgramming;

public class D05_konversiData {
    public static void main(String[] args){
        int nilai = 156;
        long tempLong;
        byte tempByte;
        
        //Memperluas rentang nilai ke tipedata yang jangkauannya lebih besar
        System.out.println("Integer to Long");        
        System.out.println("-Nilai pada Integer\t: " + nilai);
        tempLong = nilai;
        System.out.println("-Nilai pada Long\t: " + tempLong);        
        System.out.println("\n");
        
        //Memperkecil rentang nilai ke tipedata yang jangkauannya lebih kecil
        System.out.println("Integer to Byte");        
        System.out.println("-Nilai pada Integer\t: " + nilai);
        tempByte = (byte)nilai; //Menggunakan casting
        System.out.println("-Nilai pada Long\t: " + tempByte);        
        System.out.println("\n");
        
        //Casting pembagian
        System.out.println("Casting Pembagian");        
        int x=25,y=4;
        float hasil;
        hasil = x / y; //hasil dapat menyimpan bilangan real, tetapi pembagian integer dengan integer akan menghasilkan integer
        System.out.printf("-Hasil dari %d / %d\t: %f\n", x, y, hasil);
        hasil = (float)x / y; //mengcasting variable x menjadi float, agar pembagian yang dihasilkan bertipe float(real)
        System.out.printf("-Hasil dari %d / %d\t: %f", x, y, hasil);        
        System.out.println("\n");    
    }   

}