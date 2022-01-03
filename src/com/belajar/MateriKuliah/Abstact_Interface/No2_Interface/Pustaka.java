package com.belajar.MateriKuliah.Abstact_Interface.No2_Interface;

public class Pustaka implements TokoBuku,Buku,Pemasaran{

    private String judul, telp, kota, penerbit, penulis;
    private int harga, satuan, jumlah, totalHal;    

    public Pustaka(String judul, String penulis, String penerbit, 
                   String kota, String telp, int harga, 
                   int jumlah, int total){
        
        this.judul = judul;
        this.penulis = penulis;
        this.penerbit = penerbit;
        this.kota = kota;
        this.telp = telp;
        this.harga = harga;
        this.jumlah = jumlah;
        this.totalHal = total;        
    }
        
    @Override
    public int getharga() { return this.harga; }

    @Override
    public int getsatuan() { return this.satuan; }

    @Override
    public String judul() { return this.judul; }

    @Override
    public String penulis() { return this.penulis; }
    
    @Override
    public String penerbit() { return this.penerbit; }
    
    @Override
    public void kota() { System.out.println(this.kota); }
    
    @Override
    public void telp() { System.out.println(this.telp); }
    
    public int getTotalHal(){
        return this.totalHal;
    }
    
    @Override
    public String toString(){
        return "Judul\t\t: " + judul() + "\n"+
               "Penulis\t\t: " + penulis() + "\n" +
               "Penerbit\t: " + penerbit() + "\n" +
               "Kota\t\t: " + kota + "\n" +
               "Telp\t\t: " + telp + "\n" +
               "Harga Buku\t: Rp." + getharga() + "\n" +
               "Jumlah Buku\t: " + jumlah + "\n" +
               "Total Hal\t: " +  getTotalHal() + " hal";        
    }
    
    public static void main(String[] args){
        Pustaka object1 = new Pustaka("Pemrograman dengan Java",
                                       "Adam M Bachtiar",
                                       "Informatika",
                                       "Bandung",
                                       "021-123456",
                                       25000,
                                       5,
                                       262);
        
        System.out.println("=========================================================");
        System.out.println(" INFORMASI BUKU");
        System.out.println("=========================================================");

        System.out.println(object1.toString());
    }

}
