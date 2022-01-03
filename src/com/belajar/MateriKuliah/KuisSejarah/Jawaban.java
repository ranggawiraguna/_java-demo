/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.belajar.MateriKuliah.KuisSejarah;

import java.io.Serializable;

/**
 *
 * @author Rabiatul
 */
public class Jawaban implements Serializable{
    private static final long serialVersionUID = 1L;
    String jawaban1, jawaban2, jawaban3, jawaban4;
    
    Jawaban(String a,String b,String c,String d){
        this.jawaban1=a;
        this.jawaban2=b;
        this.jawaban3=c;
        this.jawaban4=d;
    }
}