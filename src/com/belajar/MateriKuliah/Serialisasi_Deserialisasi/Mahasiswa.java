package com.belajar.MateriKuliah.Serialisasi_Deserialisasi;

import java.io.Serializable;

public class Mahasiswa implements Serializable {
    private static final long serialVersionUID = -5800843163467281306L;
	private String nama, nim, jurusan, fakultas;
	
	public Mahasiswa(String nama, String nim, String jurusan, String fakultas){
		this.nama = nama;
		this.nim = nim;
		this.jurusan = jurusan;
		this.fakultas = fakultas;
	}
	
	public String getNama() { return nama; }

	public void setNama(String nama) { this.nama = nama; }

	public String getNim() { return nim; }

	public void setNim(String nim) { this.nim = nim; }

	public String getJurusan() { return jurusan; }

	public void setJurusan(String jurusan) { this.jurusan = jurusan; }

	public String getFakultas() { return jurusan; }

	public void setFakultas(String fakultas) { this.fakultas = fakultas; }
	
	public String toString(){
		return  "Nama     : " + nama     + "\n" +
				"Nim      : " + nim      + "\n" +
				"Jurusan  : " + jurusan  + "\n" +
				"Fakultas : " + fakultas + "\n" ;
	}	
}
