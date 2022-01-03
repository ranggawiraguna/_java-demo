package com.belajar.DasarProgramming;

public class D02_tipeData {
    public static void main(String[] args){
    //boolean
    boolean satu,dua; //default value = false
    satu = true;
    dua = false;
    System.out.print("Tipe Data Boolean\n"); 
    System.out.print("-Nilai logika satu\t: " + satu + "\n"); 
    System.out.println("-Nilai logika dua\t: " + dua); 
    System.out.println("-Ukuran tipedata\t: 1bit");     
    System.out.print("\n");  
    
    //char
    char huruf1,huruf2; //default value = null, error jika ditampilkan ke output
    huruf1 = 'A';
    huruf2 = 'B';
    System.out.print("Tipe Data Char\n"); 
    System.out.println("-Nilai variable-1\t: " + huruf1); 
    System.out.printf("-Nilai variable-2\t: %1s\n", huruf2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Character.MAX_VALUE + "(simbol)");     
    System.out.println("-Nilai MIN Tipe Data\t: " + Character.MIN_VALUE + " (simbol)");     
    System.out.println("-Ukuran tipedata\t: " + Character.SIZE + "bit / " + Character.BYTES + "byte");         
    System.out.print("\n"); 
    
    //String
    String kata1,kata2,kata3; //default value = null, error jika ditampilkan ke output
    kata1 = "Java";
    kata2 = "Programming";
    kata3 = "Teknik Informatika";
    System.out.print("Tipe Data String\n"); 
    System.out.println("-Kata-1 & Kata-2\t: " + kata1 + " " + kata2); 
    System.out.printf("-Kata-3 (kalimat)\t: %s\n", kata3);     
    System.out.println("-Ukuran tipedata\t: Tidak Tentu");         
    System.out.print("\n"); 
    
    //byte
    byte nilaiByte1,nilaiByte2; //default value = null, error jika ditampilkan ke output
    nilaiByte1 = 1;
    nilaiByte2 = -1;
    System.out.print("Tipe Data Byte\n"); 
    System.out.println("-Nilai variable-1\t: " + nilaiByte1); 
    System.out.printf("-Nilai variable-2\t: %d\n", nilaiByte2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Byte.MAX_VALUE);     
    System.out.println("-Nilai MIN Tipe Data\t: " + Byte.MIN_VALUE);     
    System.out.println("-Ukuran tipedata\t: " + Byte.SIZE + "bit / " + Byte.BYTES + "byte");         
    System.out.print("\n"); 
    
    //short
    short nilaiShort1,nilaiShort2; //default value = null, error jika ditampilkan ke output
    nilaiShort1 = 32;
    nilaiShort2 = -32;
    System.out.print("Tipe Data Short\n"); 
    System.out.println("-Nilai variable-1\t: " + nilaiShort1); 
    System.out.printf("-Nilai variable-2\t: %d\n", nilaiShort2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Short.MAX_VALUE);     
    System.out.println("-Nilai MIN Tipe Data\t: " + Short.MIN_VALUE);     
    System.out.println("-Ukuran tipedata\t: " + Short.SIZE + "bit / " + Short.BYTES + "byte");         
    System.out.print("\n"); 
    
    //integer
    int nilaiInt1,nilaiInt2; //default value = null, error jika ditampilkan ke output
    nilaiInt1 = 214;
    nilaiInt2 = -214;
    System.out.print("Tipe Data Integer\n"); 
    System.out.println("-Nilai variable-1\t: " + nilaiInt1); 
    System.out.printf("-Nilai variable-2\t: %d\n", nilaiInt2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Integer.MAX_VALUE);     
    System.out.println("-Nilai MIN Tipe Data\t: " + Integer.MIN_VALUE);     
    System.out.println("-Ukuran tipedata\t: " + Integer.SIZE + "bit / " + Integer.BYTES + "byte");         
    System.out.print("\n"); 
    
    //long
    int nilaiLong1,nilaiLong2; //default value = null, error jika ditampilkan ke output
    nilaiLong1 = 9223;
    nilaiLong2 = -9223;
    System.out.print("Tipe Data Long\n"); 
    System.out.println("-Nilai variable-1\t: " + nilaiLong1); 
    System.out.printf("-Nilai variable-2\t: %d\n", nilaiLong2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Long.MAX_VALUE);     
    System.out.println("-Nilai MIN Tipe Data\t: " + Long.MIN_VALUE);     
    System.out.println("-Ukuran tipedata\t: " + Long.SIZE + "bit / " + Long.BYTES + "byte");         
    System.out.print("\n"); 
    
    //float
    float nilaiFloat1,nilaiFloat2; //default value = nullf, error jika ditampilkan ke output
    nilaiFloat1 = 342.82f;
    nilaiFloat2 = -140.45f;
    System.out.print("Tipe Data Float\n"); 
    System.out.println("-Nilai variable-1\t: " + nilaiFloat1); 
    System.out.printf("-Nilai variable-2\t: %f\n", nilaiFloat2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Float.MAX_VALUE);     
    System.out.println("-Nilai MIN Tipe Data\t: " + Float.MIN_VALUE);     
    System.out.println("-Ukuran tipedata\t: " + Float.SIZE + "bit / " + Float.BYTES + "byte");         
    System.out.print("\n"); 
    
    //double
    double nilaiDouble1,nilaiDouble2; //default value = nulld, error jika ditampilkan ke output
    nilaiDouble1 = 1797.693d;
    nilaiDouble2 = -4900.032d;
    System.out.print("Tipe Data Double\n"); 
    System.out.println("-Nilai variable-1\t: " + nilaiDouble1); 
    System.out.printf("-Nilai variable-2\t: %f\n", nilaiDouble2); 
    System.out.println("-Nilai MAX Tipe Data\t: " + Double.MAX_VALUE);     
    System.out.println("-Nilai MIN Tipe Data\t: " + Double.MIN_VALUE);     
    System.out.println("-Ukuran tipedata\t: " + Double.SIZE + "bit / " + Double.BYTES + "byte");         
    System.out.print("\n"); 
        
    }
    
}
