package com.belajar.MateriKuliah.RanggaWiraguna_1803015106_UAS_PPBO_4A.Jawaban_No_3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisasi {
	public static void main(String[] args) {
		Karyawan rangga = new Karyawan("Rangga Wiraguna", "1803015106", "Jakarta", "20 Juni 2000");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("./src/com/belajar/MateriKuliah/RanggaWiraguna_1803015106_UAS_PPBO_4A/Jawaban_No_3/DataKaryawan.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(rangga);
			oos.flush();
            oos.close();

			System.out.println("Note : Proses Serialisasi Object berhasil dilakukan (DataKaryawan.txt)");        
        }catch (IOException e) {
			System.out.println("\nNote : Proses Serialisasi Object gagal dilakukan");
			e.printStackTrace();
		}
	}
}


