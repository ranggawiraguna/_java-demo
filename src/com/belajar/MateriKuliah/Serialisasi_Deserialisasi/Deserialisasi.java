package com.belajar.MateriKuliah.Serialisasi_Deserialisasi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialisasi {
	public static void main(String[] args) throws ClassNotFoundException{
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("./src/com/belajar/MateriKuliah/Serialisasi_Deserialisasi/DataMahasiswa.txt"));
			Mahasiswa mahasiswa1 = (Mahasiswa)in.readObject();
			System.out.println(mahasiswa1.toString());

			System.out.println("\nNote : Proses Deserialisasi Object berhasil dilakukan");
			in.close();  
		} catch (FileNotFoundException e) {
			System.out.println("\nNote : Proses Deserialisasi Object gagal dilakukan");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("\nNote : Proses Deserialisasi Object gagal dilakukan");
			e.printStackTrace();
		}  
	}
}


