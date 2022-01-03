package com.belajar.MateriKuliah.RanggaWiraguna_1803015106_UAS_PPBO_4A.Jawaban_No_2;

public class Pustaka implements TokoBuku, Buku, Pemasaran {
    private String judul, telp, kota, penerbit, penulis;
    private int harga, satuan, jumlah, totalHal;

    public Pustaka(String judul, String penulis, String penerbit, String kota, String telp, int harga, int jumlah,
            int total) {

        setJudul(judul);
        setPenulis(penulis);
        setPenerbit(penerbit);
        setKota(kota);
        setTelp(telp);
        this.harga = harga;
        this.jumlah = jumlah;
        this.totalHal = total;
    }

    @Override
    public int getharga() {
        return this.harga;
    }

    @Override
    public int getsatuan() {
        return this.satuan;
    }

    @Override
    public void setJudul(String newJudul) {
        this.judul = newJudul;
    }

    @Override
    public String getJudul() {
        return this.judul;
    }

    @Override
    public void setPenulis(String newPenulis) {
        this.penulis = newPenulis;
    }

    @Override
    public String getPenulis() {
        return this.penulis;
    }

    @Override
    public void setPenerbit(String newPenerbit) {
        this.penerbit = newPenerbit;
    }

    @Override
    public String getPenerbit() {
        return this.penerbit;
    }

    @Override
    public void setKota(String newKota) {
        this.kota = newKota;
    }

    @Override
    public String getKota() {
        return this.kota;
    }

    @Override
    public void setTelp(String newTelp) {
        this.telp = newTelp;
    };

    @Override
    public String getTelp() {
        return this.telp;
    }

    public int getTotalHal() {
        return this.totalHal;
    }

    @Override
    public String toString() {
        return "Judul\t\t: " + getJudul() + "\n" + "Penulis\t\t: " + getPenulis() + "\n" + "Penerbit\t: "
                + getPenerbit() + "\n" + "Kota\t\t: " + getKota() + "\n" + "Telp\t\t: " + getTelp() + "\n"
                + "Harga Buku\t: Rp." + getharga() + "\n" + "Jumlah Buku\t: " + jumlah + "\n" + "Total Hal\t: "
                + getTotalHal() + " hal";
    }

    public static void main(String[] args) {
        Pustaka pustaka1 = new Pustaka("Pemrograman dengan Java", "Adam M Bachtiar", "Informatika", "Bandung",
                "021-123456", 25000, 5, 262);

        System.out.println("=========================================================");
        System.out.println(" INFORMASI BUKU");
        System.out.println("=========================================================");
        System.out.println(pustaka1.toString());
    }
}
