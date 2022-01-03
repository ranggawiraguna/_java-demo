package com.belajar.MateriKuliah.TestAndroid;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OperasiFile {
    public static void main(String[] args) throws IOException {
        //Initialize File which will be operated
        File fileReal = new File("./src/com/belajar/MateriKuliah/TestAndroid/FileReal.pdf");

        // Convert File to ByteArray
        byte[] byteFile = fileToByteArray(fileReal);

        // Convert ByteArray to file
        File fileFromByte = byteArrayToFile(byteFile);

        //Show Hasil File Asli dengan File Dari ByteArray
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + fileReal);
        Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + fileFromByte);
    }

    private static byte[] fileToByteArray(File file) {
        try {
            FileInputStream fis = new FileInputStream(file);

            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] buf = new byte[1024];
            try {
                for (int readNum; (readNum = fis.read(buf)) != -1;) {
                    bos.write(buf, 0, readNum);
                }

                fis.close();
                return bos.toByteArray();
            } catch (IOException e) {
                e.printStackTrace();
                return new byte[0];
            }

        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        }

        return new byte[0];
    }

    private static File byteArrayToFile(byte[] byteFile) {
        try {
            File someFile = new File("./src/com/belajar/MateriKuliah/TestAndroid/FileFromByte.pdf");
            FileOutputStream fos = new FileOutputStream(someFile);

            fos.write(byteFile);
            fos.flush();
            fos.close();

            return someFile;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }    
    }
}