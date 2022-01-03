/*
String memiliki memori tersendiri khusus data betipe teks/String
Memori tersebut dinamakan StringPool

Data yang dimasukkan yang dimasukkan kedalam StringPool adalah
data yang di deklarasikan secara literal/langsung tanpa menggunakan
method lain
Sedangkan data String yang dideklarasikan dengan method lain
akan dimasukkan kedalam memori heap bersama data selain String

Pengalokasian memori pada StringPool akan beraptokan pada value
yang tersedia dalam memori program, jadi address dari sebuah variable bisa
berubah-ubah tergantung data yang ada pada variable tersebut
Sehingga bila ada dua variable String yang memiliki data String yang sama,
maka address dari kedua variable tersebut sama
*/

package com.belajar.DasarProgramming;

import java.util.Scanner;
import java.lang.String;
import java.util.Formatter;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner
@SuppressWarnings({"resource"}) 
public class D21_String {    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        judul();
        System.out.println("\t\t\t\t   STRING");
        judul();
        
        String teks1, teks2, teks3, teks4, teks5, teks6;

        garis();
        System.out.println("ALOKASI MEMORI STRING (STRING POOL)");
        teks1 = "Rangga Wiraguna";
        print("teks1", teks1);

        teks2 = "Rangga Wiraguna";
        print("teks2", teks2);
        
        System.out.print("\nMasukkan teks3 : ");
        teks3 = keyboard.nextLine(); //Inputkan "Rangga Wiraguna"
        
        System.out.println();
        print("teks1", teks1);
        print("teks2", teks2);        
        print("teks3", teks3);
        
        //varString.charAt(indeks) || Mengambil karakter di indeks tertentu pada data String
        garis();
        System.out.println("varString.charAt(indeks)");
        System.out.println("teks1[0] = " + teks1.charAt(0));
        System.out.println("teks2[1] = " + teks2.charAt(1));
        System.out.println("teks3[2] = " + teks3.charAt(2));
        
        //varString.substring(awal, --akhir) || Mengambil String di range indeks tertentu pada data String
        garis();
        teks1 = "Indra Wiraguna";        
        teks2 = teks1;        
        teks3 = "Indra" + teks3.substring(6, 15);        
        
        System.out.println("varString.substring(awal,--akhir)");
        print("teks1", teks1);
        print("teks2", teks2);        
        print("teks3", teks3);
        
        //Concat || Menambahkan/Menyambung kalimat kedalan String
        garis();
        System.out.println("Concat + String");
        int tahun = 2019;
        teks4 = "Belajar";
        print("teks4 = ", teks4);
        teks4 = teks4 + " Pemrograman";
        print("teks4 = ", teks4);
        teks4 = teks4 + " " + tahun;
        print("teks4 = ", teks4);        

        //LowerCase & UpperCase;
        garis();
        System.out.println("varString.toLowerCase && varString.toUpperCase");
        print("teks4 = ", teks4.toLowerCase());
        print("teks4 = ", teks4.toUpperCase());
        
        //replace
        garis();
        System.out.println("varString.replace(old,new)");
        print("teks4 = ", teks4);                
        teks4 = teks4.replace("2019", "2020"); 
        print("teks4 = ", teks4);        
        
        //Equals
        garis();
        System.out.println("Equals");        

        System.out.println("varString1==varString2");
        if(teks1==teks2){
            System.out.println("*teks1 && teks2 adalah sama");
        }else{
            System.out.println("*teks1 && teks2 adalah berbeda");
        }

        if(teks2==teks3){
            System.out.println("*teks2 && teks3 adalah sama");
        }else{
            System.out.println("*teks2 && teks3 adalah berbeda");
        }
        
        System.out.println();
        
        System.out.println("varString1.equals(varString2)");
        if(teks1.equals(teks2)){
            System.out.println("*teks1 && teks2 adalah sama");
        }else{
            System.out.println("*teks1 && teks2 adalah berbeda");
        }

        if(teks2.equals(teks3)){
            System.out.println("*teks2 && teks3 adalah sama");
        }else{
            System.out.println("*teks2 && teks3 adalah berbeda");
        }        

        //varString2.compareTo(varString1)
        garis();
        System.out.println("varString2.compareTo(varString1)");
        teks5 = "Rangga";
        teks6 = "Indra";
        int compare = teks5.compareTo(teks6);
        System.out.println("Perbandingan " + teks6 + " & " + teks5 + " berjarak " + compare);
        teks5 = "Rangga";
        teks6 = "Rafi";
        compare = teks6.compareTo(teks5);
        System.out.println("Perbandingan " + teks5 + " & " + teks6 + " berjarak " + compare);
        garis();
        judul();

        garis();
        System.out.print("Tekan ENTER untuk melanjutkan!");
        keyboard.nextLine();
        garis();
        
        //Format String
        //Conversion : f=floating point , d=integer , c=character , s=string , b=boolean 
        //Struktur Format : %[argumen-index][flags][width][.precision]conversion
        judul();
        System.out.println("\t\t\t       FORMAT STRING");
        judul();
        
        String nama = "Rangga";
        char gol = 'A';
        int umur = 19;
        boolean valid = true;
        
        //Conversion , simbol akan ditukar dengan variable yang serupa sesuai urutannya
        System.out.printf("Nama : %s\nGol.Darah : %c\nUmur : %d\nValidasi : %b\n\n", nama,gol,umur,valid);

        //%[argumen_index]conversion , simbol akan ditukar dengan variable serupa sesuai indexnya
        System.out.printf("Namanya %1$s, Golongan darah %1$s adalah %2$c, Umur %1$s adalah %3$d\n\n", nama,gol,umur);

        //%[flags]conversion, menampilkan positif/negatif didepan angka
        System.out.printf("Tahun depan umur %1s bertambah %+d\n\n", nama, 1);

        //[widht]conversion, mengatur lebar slot pada suatu variable
        int angka = 1001;
        System.out.printf("angka = %d\n", angka);
        System.out.printf("angka = %7d\n", angka);    //Mengatur lebar dari variable sebanyak 7slots
        System.out.printf("angka = %+7d\n", angka);   //+Flags menempati 1slot di format
        System.out.printf("angka = %-7d\n", angka);   //-Mengatur rata kiri dari variable yang ditampilkan
        System.out.printf("angka = %+-7d\n", angka);  //Penggabungan dari flags "+" dan "-"
        System.out.printf("angka = %08d\n", angka);   //Flags "0", menampilkan 0 didepan angka jika ada slot kosong
        System.out.printf("angka = %+08d\n\n", angka);  //Penggabungan dari Flags "+" dan "0"    
        
        int angka2 = 1234567890;
        System.out.printf("angka = %,d\n", angka2);   //Flags "," akan menandakan delimeter setiap seribu ,000
        System.out.printf("angka = %,15d\n", angka2);
        System.out.printf("angka = %,+15d\n", angka2);
        System.out.printf("angka = %,-15d\n", angka2);
        System.out.printf("angka = %,+-15d\n", angka2);
        System.out.printf("angka = %,015d\n", angka2);
        System.out.printf("angka = %,+015d\n\n", angka2);
        
        float angka3 = 77.123f;
        System.out.printf("angka = %f\n", angka3);            
        System.out.printf("angka = %12f\n", angka3);        
        System.out.printf("angka = %+12f\n", angka3);                
        System.out.printf("angka = %-12f\n", angka3);                
        System.out.printf("angka = %+-12f\n", angka3);                
        System.out.printf("angka = %012f\n", angka3);                
        System.out.printf("angka = %+012f\n\n", angka3);
    
        //[.precision]conversion , mengatur digit dibelakang koma pada bilangan real(float0
        float angka4 = 88.257f;
        System.out.printf("angka = %f\n", angka4);            
        System.out.printf("angka = %.3f\n", angka4);            
        System.out.printf("angka = %.2f\n", angka4);            
        System.out.printf("angka = %12.2f\n", angka4);        
        System.out.printf("angka = %+12.2f\n", angka4);                
        System.out.printf("angka = %-12.2f\n", angka4);                
        System.out.printf("angka = %+-12.2f\n", angka4);                
        System.out.printf("angka = %012.2f\n", angka4);                
        System.out.printf("angka = %+012.2f\n\n", angka4);

        //Contoh
        float a = 25.723811f, b = 13.942715f, c = a - b;
        System.out.printf("Nilai a = %1$+2.2f \nNilai b = %2$+2.2f \n%1$+2.2f - %2$+2.2f  = %3$+2.2f\n\n", a,b,c);
        
        //Save format kedalam variable String
        String standar = "Hasil dari (( " + a + ") - ( " + b + ")) adalah " + c;
        System.out.println("[standar]\n" + standar + "\n");
        
        String fString = String.format("Hasil dari ((%+2.2f) - (%+2.2f)) adalah %+2.1f", a,b,c);
        System.out.println("[fString]\n" + fString + "\n");

        //Save format kedalan variable StringBuilder
        StringBuilder Builder = new StringBuilder();
        Formatter formatBuilder = new Formatter(Builder);
        
        formatBuilder.format("Hasil dari ((%+2.2f) - (%+2.2f)) adalah %+2.1f", a,b,c);
        System.out.println("[Builder]\n" + Builder);
        
        judul();
        
    }   

    private static void print(String nama, String value){
        System.out.println(nama + " = " + value + " || " + Integer.toHexString(System.identityHashCode(value)));
    }

    private static void judul(){
        for(int i=0; i<75; i++){ System.out.print("="); }
        System.out.println();
    }

    private static void garis(){
        for(int i=0; i<75; i++){ System.out.print("-"); }
        System.out.println();
    }
}
