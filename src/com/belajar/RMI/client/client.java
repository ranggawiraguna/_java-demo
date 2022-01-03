/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.RMI.client;

import com.belajar.RMI.iterface.luasInterface;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author user
 */
public class client {
    public static void main (String[] args) throws RemoteException, NotBoundException, MalformedURLException, IOException{
        String respons = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int panjang, lebar;
        
        luasInterface lif=(luasInterface)Naming.lookup("rmi://localhost:2020/hitungluas");
        System.out.println("menyambungkan ke server...........");
        
        System.out.println("masukan dimensi panjang : ");
        panjang = Integer.parseInt(in.readLine());
        
        System.out.println("masukan dimensi lebar : ");
        lebar = Integer.parseInt(in.readLine());
        
        respons=lif.hitungluas(panjang, lebar);
        System.out.println(respons);
    }
}
