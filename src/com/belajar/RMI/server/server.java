/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.RMI.server;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author user
 */
public class server {
    public static void main (String[] args) throws RemoteException, NotBoundException{
        Registry reg=LocateRegistry.createRegistry(2020);
        luasImplementasi lm = new luasImplementasi();
        reg.rebind("hitungluas", (Remote) lm);
        System.out.println("server sedang berjalan");
    }
}
