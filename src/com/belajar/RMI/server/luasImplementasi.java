/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.RMI.server;

import com.belajar.RMI.iterface.luasInterface;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author user
 */
public class luasImplementasi extends UnicastRemoteObject implements luasInterface{
    
    protected luasImplementasi() throws RemoteException {
        super();
    }

    public String hitungluas(int p, int l) throws RemoteException {
        System.out.println("Client Mengirim" +p+ "dan "+l);
        double luas = p*l;
        return "luas persegi panjang tersebut yaitu : "+luas;
    }
    
}
