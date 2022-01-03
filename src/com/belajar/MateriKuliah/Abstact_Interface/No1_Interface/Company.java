
package com.belajar.MateriKuliah.Abstact_Interface.No1_Interface;

interface Company {
    static final String PROVINSI = "JAKARTA TIMUR";
    String NEGARA = "INDONESIA";
    public void setNama (String newNama);
    public void setAlamat (String newAlamat);
    public void setPhone (String newPhone);
    public String getNama();
    public String getAlamat();
    public String getPhone();  
}
