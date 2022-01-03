package com.belajar.DasarProgramming;

public class D08_komparasi {
    public static void main(String[] args){
        int a,b;
        boolean nilaiKomparasi; //dapat menyimpan nilai logika true/false 
        
        //PERSAMAAN ==
        System.out.println("OPERATOR PERSAMAAN");
        a=10; b=10;
        nilaiKomparasi = (a==b);
        System.out.printf("%d == %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=11; b=19;        
        nilaiKomparasi = (a==b);
        System.out.printf("%d == %d bernilai %s\n\n", a, b, nilaiKomparasi);
                
        //PERTIDAKSAMAAN !=
        System.out.println("OPERATOR PERTIDAKSAMAAN");
        a=11; b=19;
        nilaiKomparasi = (a!=b);
        System.out.printf("%d != %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=10; b=10;        
        nilaiKomparasi = (a!=b);
        System.out.printf("%d != %d bernilai %s\n\n", a, b, nilaiKomparasi);
        
        //KURANG DARI <
        System.out.println("OPERATOR KURANG DARI");        
        a=11; b=19;
        nilaiKomparasi = (a<b);
        System.out.printf("%d < %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=10; b=10;        
        nilaiKomparasi = (a<b);
        System.out.printf("%d < %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=19; b=11;
        nilaiKomparasi = (a<b);
        System.out.printf("%d < %d bernilai %s\n\n", a, b, nilaiKomparasi);

        //KURANG DARI atau SAMA DENGAN <=
        System.out.println("OPERATOR KURANG DARI atau SAMA DENGAN");                
        a=11; b=19;
        nilaiKomparasi = (a<=b);
        System.out.printf("%d <= %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=10; b=10;        
        nilaiKomparasi = (a<=b);
        System.out.printf("%d <= %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=19; b=11;
        nilaiKomparasi = (a<=b);
        System.out.printf("%d <= %d bernilai %s\n\n", a, b, nilaiKomparasi);
        
        //LEBIH DARI >
        System.out.println("OPERATOR LEBIH DARI");        
        a=19; b=11;
        nilaiKomparasi = (a>b);
        System.out.printf("%d > %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=10; b=10;        
        nilaiKomparasi = (a>b);
        System.out.printf("%d > %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=11; b=19;
        nilaiKomparasi = (a>b);
        System.out.printf("%d > %d bernilai %s\n\n", a, b, nilaiKomparasi);

        //LEBIH DARI atau SAMA DENGAN >=
        System.out.println("OPERATOR LEBIH DARI atau SAMA DENGAN");        
        a=19; b=11;
        nilaiKomparasi = (a>=b);
        System.out.printf("%d >= %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=10; b=10;        
        nilaiKomparasi = (a>=b);
        System.out.printf("%d >= %d bernilai %s\n", a, b, nilaiKomparasi);
        
        a=11; b=19;
        nilaiKomparasi = (a>=b);
        System.out.printf("%d >= %d bernilai %s\n\n", a, b, nilaiKomparasi);
        
    }
    
}
