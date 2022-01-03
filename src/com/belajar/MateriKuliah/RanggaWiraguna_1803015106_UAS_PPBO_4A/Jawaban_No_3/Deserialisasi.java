package com.belajar.MateriKuliah.RanggaWiraguna_1803015106_UAS_PPBO_4A.Jawaban_No_3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisasi {
	public static void main(String[] args) throws ClassNotFoundException{
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream(
					"./src/com/belajar/MateriKuliah/RanggaWiraguna_1803015106_UAS_PPBO_4A/Jawaban_No_3/DataKaryawan.txt"));
			Karyawan rangga = (Karyawan)in.readObject();
			System.out.println(rangga.toString());

			System.out.println("\nNote : Proses Deserialisasi Object berhasil dilakukan");
			in.close();  
		}catch (IOException e) {
			System.out.println("\nNote : Proses Deserialisasi Object gagal dilakukan");
			e.printStackTrace();
		}  
	}
}


