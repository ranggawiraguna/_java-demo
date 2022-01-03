package com.belajar.DasarProgramming;

public class D06_unary {
    public static void main(String[] args){
    int nilai;

    //Unary + -
    nilai = 10;
    System.out.println("Penggunaan unary '+' dan '-'");
    System.out.printf("-Variable nilai\t\t\t\t : %d\n", nilai);
    System.out.printf("-Variable nilai dengan unary '+'\t : %d\n", +nilai);
    System.out.printf("-Variable nilai dengan unary '-'\t : %d", -nilai);
    System.out.println("\n");

    //Unary Increment
    System.out.println("Penggunaan unary Increment");
    System.out.println("Prefix");
    nilai = 10;
    System.out.printf("-Variable nilai\t\t\t\t : %d\n", nilai);
    System.out.printf("-Variable nilai dengan increment prefix  : %d\n", ++nilai);
    System.out.printf("-Variable nilai setelah increment\t : %d\n", nilai);
    nilai = 10;
    System.out.println("Postfix");    
    System.out.printf("-Variable nilai\t\t\t\t : %d\n", nilai);
    System.out.printf("-Variable nilai dengan increment postfix : %d\n", nilai++);
    System.out.printf("-Variable nilai setelah increment\t : %d\n", nilai);
    System.out.println("\n");

    //Unary Decrement
    System.out.println("Penggunaan unary Decrement");
    System.out.println("Prefix");
    nilai = 10;
    System.out.printf("-Variable nilai\t\t\t\t : %d\n", nilai);
    System.out.printf("-Variable nilai dengan decrement prefix  : %d\n", --nilai);
    System.out.printf("-Variable nilai setelah decrement\t : %d\n", nilai);
    nilai = 10;
    System.out.println("Postfix");    
    System.out.printf("-Variable nilai\t\t\t\t : %d\n", nilai);
    System.out.printf("-Variable nilai dengan decrement postfix : %d\n", nilai--);
    System.out.printf("-Variable nilai setelah decrement\t : %d\n", nilai);
    System.out.print("\n");

    }

}