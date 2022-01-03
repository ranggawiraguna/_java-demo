package com.belajar.MateriKuliah.RanggaWiraguna_1803015106_UAS_PPBO_4A.Jawaban_No_3;

import java.io.Serializable;

public class Karyawan implements Serializable {
    private static final long serialVersionUID = -5800843163467281306L;
	private String nama, no_identitas, tempat_lahir, tanggal_lahir;
	
	public Karyawan(String nama, String no_identitas, String tempat_lahir, String tanggal_lahir){
		setNama(nama);
		setNoIdentitas(no_identitas);
		setTempatLahir(tempat_lahir);
		setTanggalLahir(tanggal_lahir);
	}
	
	public String getNama() { return nama; }

	public void setNama(String nama) { this.nama = nama; }

	public String getNoIdentitas() { return no_identitas; }

	public void setNoIdentitas(String no_identitas) { this.no_identitas = no_identitas; }

	public String getTempatLahir() { return tempat_lahir; }

	public void setTempatLahir(String tempat_lahir) { this.tempat_lahir = tempat_lahir; }

	public String getTanggalLahir() { return tanggal_lahir; }

	public void setTanggalLahir(String tanggal_lahir) { this.tanggal_lahir = tanggal_lahir; }
	
	public String toString(){
		return  "Nama          : " + getNama()     + "\n" +
				"No Identitas  : " + getNoIdentitas()    + "\n" +
				"Tempat Lahir  : " + getTempatLahir()  + "\n" +
				"Tanggal Lahir : " + getTanggalLahir() + "\n" ;
	}	
}
