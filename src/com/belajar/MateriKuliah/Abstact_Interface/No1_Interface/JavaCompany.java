
package com.belajar.MateriKuliah.Abstact_Interface.No1_Interface;

class ToyCompany implements Company {
String nama, alamat, phone;
    public ToyCompany (String newNama, String newAlamat, String newPhone){
        nama = newNama;
        alamat = newAlamat;
        phone = newPhone;
    }
        
    @Override
    public void setNama(String newNama) {
        this.nama = newNama;
    }

    @Override
    public void setAlamat(String newAlamat) {
        this.alamat = newAlamat;
    }

    @Override
    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    @Override
    public String getNama() {
        return this.nama;
    }

    @Override
    public String getAlamat() {
        return this.alamat;
    }

    @Override
    public String getPhone() {
        return this.phone;
    }

     public String getProvinsi(){
        return Company.PROVINSI;
    }
    
    public String getNegara (){
        return Company.NEGARA;
    }
  
    @Override
    public String toString(){
        return "nama\t\t:" + nama + "\n"+
               "alamat\t\t:" + alamat + "\n" +
               "phone\t\t:" + phone + "\n" +
               "provinsi\t:" + PROVINSI + "\n" +
               "negara\t\t:" + NEGARA ;
    }
}
   
public class JavaCompany {
    public static void main(String[] args) {
        test();
    }
    
    static void test(){
        System.out.println("Informasi Perusahaan");
        System.out.println(new ToyCompany("Toko Boneka", "Jl. Tanah Merdeka", "112233").toString());
    }
}
