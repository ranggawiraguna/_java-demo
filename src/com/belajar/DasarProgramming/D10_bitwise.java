package com.belajar.DasarProgramming;

public class D10_bitwise {
    public static void main(String[] args){
        byte a=22, b=26, temp;
        String tempBits;
        
        //Desimal to Bitwise
        System.out.println("DESIMAL TO BITWISE");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%d = %s\n", a, tempBits);
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%d = %s\n\n", b, tempBits);
        
        //BITWISE SHIFT LEFT
        System.out.println("BITWISE SHIFT LEFT");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%d = %s", a, tempBits);
        temp = (byte)(a<<1);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.printf(" <SHIFT.LEFT-1> %d = %s\n", temp, tempBits);
        
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%d = %s", b, tempBits);
        temp = (byte)(b<<2);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.printf(" <SHIFT.LEFT-2> %d = %s\n\n", temp, tempBits);
        
        //BITWISE SHIFT RIGHT
        System.out.println("BITWISE SHIFT RIGHT");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%d = %s", a, tempBits);
        temp = (byte)(a>>1);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.printf(" <SHIFT.RIGHT-1> %d = %s\n", temp, tempBits);
        
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%d = %s", b, tempBits);
        temp = (byte)(b>>2);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.printf(" <SHIFT.RIGHT-2> %d = %s\n\n", temp, tempBits);
        
        //BITWISE OR |
        System.out.println("BITWISE OR");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n", tempBits, a);
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n", tempBits, b);
        temp = (byte)(a|b);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.println("-------------------(|)");
        System.out.printf("%s = %d\n\n", tempBits, temp); 
                
        //BITWISE AND &
        System.out.println("BITWISE AND");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n", tempBits, a);
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n", tempBits, b);
        temp = (byte)(a&b);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.println("-------------------(&)"); 
        System.out.printf("%s = %d\n\n", tempBits, temp); 
        
        //BITWISE XOR ^
        System.out.println("BITWISE OR");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%s = %d\n", tempBits, a);
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%s = %d\n", tempBits, b);
        temp = (byte)(a^b);
        tempBits = String.format("%8s", Integer.toBinaryString(temp)).replace(' ' , '0');
        System.out.println("-------------------(^)");
        System.out.printf("%s = %d\n\n", tempBits, temp);
        
        //BITWISE NOT ~
        System.out.println("BITWISE NOT");
        tempBits = String.format("%8s", Integer.toBinaryString(a)).replace(' ' , '0');
        System.out.printf("%d = %s", a, tempBits);
        temp = (byte)(~a);
        tempBits = String.format("%s", Integer.toBinaryString(temp)).substring(24);
        System.out.printf(" <~> %d = %s\n", temp, tempBits);
        
        tempBits = String.format("%8s", Integer.toBinaryString(b)).replace(' ' , '0');
        System.out.printf("%d = %s", b, tempBits);
        temp = (byte)(~b);
        tempBits = String.format("%s", Integer.toBinaryString(temp)).substring(24);
        System.out.printf(" <~> %d = %s\n\n", temp, tempBits);
        
    }
}

/*==============================================================================================================================
PEMBAHASAN
[1]DESIMAL to BITWISE
   String.format("%(jumlahChar)s", Integer.toBinaryString(nilaiDesimal))
   Mengubah nilai desimal menjadi biner dalam bentuk string(BinaryString)

[2]REPLACE CHARACTER
   String.format().replace('oldChar' , 'newChar')
   Mengubah suatu karakter pada pada data string menjadi karakter yang diinginkan

[3]BITWISE SHIFT LEFT
   (Desimal)<<(jumlahDigitPenggeseran)
   mengubah desimal dengan menggeser setiap digit BinaryString-nya ke sebelah kiri 

[4]BITWISE SHIFT RIGHT
   (Desimal)>>(jumlahDigitPenggeseran)
   mengubah desimal dengan menggeser setiap digit BinaryString-nya ke sebelah kanan 

[5]BITWISE OR (|)
   ((Desimal) | (Desimal))
   Mengoperasikan nilai desimal berdasarkan BinaryString-nya dengan operasi logika or, di operasikan sesuai digit per digitnya

[6]BITWISE AND (&)
   ((Desimal) & (Desimal))
   Mengoperasikan nilai desimal berdasarkan BinaryString-nya dengan operasi logika and, di operasikan sesuai digit per digitnya

[7]BITWISE XOR (^)
   ((Desimal) ^ (Desimal))
   Mengoperasikan nilai desimal berdasarkan BinaryString-nya dengan operasi logika xor, di operasikan sesuai digit per digitnya

[8]BITWISE NOT (~)
   ~(Desimal)
   Mengoperasikan nilai desimal berdasarkan BinaryString-nya dengan operasi logika xor, di operasikan sesuai digit per digitnya
   Notasi ~ otomatis mengubah BinaryString-nya menjadi 01 berukuran 32bit
   karena itu tidak perlu menggunakan fungsi replace(), tetapi menngunakan fungsi subString()
   subString() berfungsi untuk mengambil suatu data string yang tersimpan dengan indeks character mulainya dari data string tsb
   subString(24), berarti mengambil data string mulai dari karakter indeks ke-25
==============================================================================================================================*/