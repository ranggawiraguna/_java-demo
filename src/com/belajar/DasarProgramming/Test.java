package com.belajar.DasarProgramming;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;

// import java.math.BigInteger;

public class Test {
  public static void main(String args[]) {
    // System.out.println(String.format("%x", new BigInteger(1, "ranggapx@gmail.com".getBytes())));

    String[] data = new String[]{
      "adeadediastu771@gmail.com",
      "adesahroni7@gmail.com",
      "adninrdn15@gmail.com",
      "afifahnurramadhani0@gmail.com",
      "ajinegaraa@gmail.com",
      "alyakhoir58@gmail.com",
      "annisaekafadhilah6@gmail.com",
      "annisamaulidaaa5@gmail.com",
      "aqielafadia19@gmail.com",
      "babel3126343@gmail.com",
      "bagussucipto80@gmail.com",
      "bertonsimamora@gmail.com",
      "bundapuputhea1228@gmail.com",
      "bungaaulia387@gmail.com",
      "cannyilmiati2017@gmail.com",
      "dadangsuparnaabs@gmail.com",
      "daniarkd7@gmail.com",
      "daudrozaan@gmail.com",
      "devienur234@gmail.com",
      "devinayuliantii07@gmail.com",
      "diahsofianaputri@gmail.com",
      "dimasadiprananda@gmail.com",
      "dklamriani@gmail.com",
      "dmaesyafirdaus@gmail.com",
      "elihendrawati31@gmail.com",
      "eniendangsulistyorini82@gmail.com",
      "ervinazhar1972@gmail.com",
      "eryantiika@gmail.com",
      "fadlanfadlin12@gmail.com",
      "fadlinur1807@gmail.com",
      "fatabdillah123@gmail.com",
      "gozymatin09@gmail.com",
      "hariyatimamang@gmail.com",
      "hibbandoankajah@gmail.com",
      "indritw93@gmail.com",
      "kamalmustofa02061989@gmail.com",
      "khoerulindri@gmail.com",
      "letiyulieti94@gmail.com",
      "lstr18022@gmail.com",
      "man103780@gmail.com",
      "meizarazhar1753@gmail.com",
      "missnadaqn@gmail.com",
      "muhammadarfankafila@gmail.com",
      "muhammadkhoirulanam14@gmail.com",
      "muhammadrizazaidaan@gmail.com",
      "nengsih1966@gmail.com",
      "niak100572@gmail.com",
      "nurlaelarahmawatipoenya@gmail.com",
      "nurmuhammadabdillah4@gmail.com",
      "nzell664@gmail.com",
      "penyeduhfajar456@gmail.com",
      "piyoituayam@gmail.com",
      "putriannesdya@gmail.com",
      "rahmapuspa0209@gmail.com",
      "ranggapx@gmail.com",
      "ranggav66@gmail.com",
      "raushanfr3@gmail.com",
      "reyyaanggita@gmail.com",
      "rizkafitriani029@gmail.com",
      "rudidwipramono@gmail.com",
      "sadiahnur73@gmail.com",
      "savirafauziah416@gmail.com",
      "selviyaniselviyani13@gmail.com",
      "senjaaangin@gmail.com",
      "sitisyariahsiti724@gmail.com",
      "slwmahesa@gmail.com",
      "srisetiani126@gmail.com",
      "sulhanfawwaz26@gmail.com",
      "telltosasya@gmail.com",
      "tiarsma14@gmail.com",
      "trioramajagandi@gmail.com",
      "wdyahesti98@gmail.com",
      "wiwisudarwati9@gmail.com",
      "yattisrimulyati3@gmail.com",
      "you365502@gmail.com",
      "zahwaauliarahma28@gmail.com",
      "ziamiganteng@gmail.com",
      "zulhazril@gmail.com"
    };    

    try {
      FileWriter myWriter = new FileWriter("data-hex.txt");
      for (String id : data) {
        myWriter.write(id + " : " + String.format("%x", new BigInteger(1, id.getBytes())) + "\n");
      }
      myWriter.close();      
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }

  }
}
