package com.belajar.DasarProgramming;

import java.util.*;
import java.util.Arrays;

//Mengabaikan warning untuk 'Resorce leak' untuk variable Scanner & 'local variable is not used'
@SuppressWarnings({"resource","unused"}) 
public class D20_array2D {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int[][] array1, array2, array3, array4, array5,
                array6, array7, array8, array9, array0;
        int[][] temp1, temp2, temp3, temp4, temp5;
        int a,b;
        char pil;

        System.out.println("==========================================");
        System.out.println("Pilihan\t: [1]Matriks Penambahan\n\t  [2]Matriks Perkalian");
        System.out.print("Pilih\t:  ");
        pil = keyboard.next().charAt(0);
        System.out.println("==========================================");
        if((pil=='1')||(pil=='2')){
            System.out.print("Masukkan Banyak Baris Matriks-1 : "); a = keyboard.nextInt();
            System.out.print("Masukkan Banyak Kolom Matriks-1 : "); b = keyboard.nextInt();
            array1 = new int[a][b];
            System.out.print("\nMasukkan Banyak Baris Matriks-2 : "); a = keyboard.nextInt();
            System.out.print("Masukkan Banyak Kolom Matriks-2 : "); b = keyboard.nextInt();
            array2 = new int[a][b];
            
            operasiMatriks(array1, array2, pil);
        }else{
            System.out.println("\nPilihan yang anda masukkan 2salah!");
            System.out.println("==========================================");                    
        }
        
    }

    private static void operasiMatriks(int[][] dataArray1, int[][] dataArray2, char key){
    
        System.out.println();
        System.out.println("[>]Matriks-1");
        dataArray1 = inputData(dataArray1);
        System.out.println();
        System.out.println("[>]Matriks-1");
        dataArray2 = inputData(dataArray2);        
        
        int[][] hasil;
        int i,j,k,temp,baris1,kolom1,baris2,kolom2;
        
        baris1 = dataArray1.length;
        kolom1 = dataArray1[0].length;        
        baris2 = dataArray2.length;
        kolom2 = dataArray2[0].length;        
        
        System.out.println("==========================================");
        
        System.out.print("Matriks-1  : ");
        for(int a=0; a<baris1; a++){
            System.out.println(Arrays.toString(dataArray1[a]));
            System.out.print("             ");
            }
           
        System.out.print("\nMatriks-2  : ");
        for(int a=0; a<baris2; a++){
            System.out.println(Arrays.toString(dataArray2[a]));
            System.out.print("             ");
        }

        if((baris1==baris2)&&(kolom1==kolom2)&&(key=='1')){            
            hasil = new int[baris1][kolom1];
            for(i=0; i<baris1; i++){
                for(j=0; j<kolom1; j++){
                    hasil[i][j] = dataArray1[i][j] + dataArray2[i][j];
                }
            }

            System.out.print("\nPenambahan : ");
            for(int a=0; a<hasil.length; a++){
                System.out.println(Arrays.toString(hasil[a]));
                System.out.print("\t     ");
            }
            
        }else if((kolom1==baris2)&&(key=='2')){            
            hasil = new int[baris1][kolom2];
            for(i=0; i<baris1; i++){
                for(j=0; j<kolom2; j++){
                    temp = 0;
                    for(k=0; k<kolom1; k++){
                        temp += dataArray1[i][k] * dataArray2[k][j];
                    }
                    hasil[i][j] = temp;
                }
            }

            System.out.print("\nPerkalian  : ");
            for(int a=0; a<hasil.length; a++){
                System.out.println(Arrays.toString(hasil[a]));
                System.out.print("\t     ");
            }
            
        }else{
            if(key=='1'){
                System.out.println("\nPenambahan Matriks tidak dapat dilakukan,\nKarena jumlah baris/kolom berbeda");
            }else{
                System.out.println("\nPerkalian Matriks tidak dapat dilakukan,\nKarena jumlah baris/kolom berbeda");
            }
        }
        
        
        System.out.println("\n==========================================");
        
    }

    
    private static int[][] inputData(int[][] dataArray){        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i=0; i<dataArray.length; i++){
            for(int j=0; j<dataArray[0].length; j++){
                System.out.printf("   -Masukkan Matriks[%d][%d] : ", (i+1), (j+1));
                dataArray[i][j] = keyboard.nextInt();
            }
        }
        System.out.println();
        
        return dataArray;
    }
    
}