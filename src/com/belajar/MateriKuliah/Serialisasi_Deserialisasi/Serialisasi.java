package com.belajar.MateriKuliah.Serialisasi_Deserialisasi;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialisasi {
	public static void main(String[] args) {
		Mahasiswa mahasiswa1 = new Mahasiswa("Rangga Wiraguna", "1803015106", "Teknik Informatika", "Fakultas Teknik");
		
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("./src/com/belajar/MateriKuliah/Serialisasi_Deserialisasi/DataMahasiswa.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			oos.writeObject(mahasiswa1);
			oos.flush();
            oos.close();

			System.out.println("Note : Proses Serialisasi Object berhasil dilakukan (DataMahasiswa.txt)");        
        } catch (FileNotFoundException e) {
			System.out.println("\nNote : Proses Serialisasi Object gagal dilakukan");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\nNote : Proses Serialisasi Object gagal dilakukan");
			e.printStackTrace();
		}
	}
}


