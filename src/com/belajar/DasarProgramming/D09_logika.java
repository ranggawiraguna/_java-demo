package com.belajar.DasarProgramming;

public class D09_logika {
    public static void main(String[] args){
        boolean a,b,c;
        
        //OR ||
        System.out.println("OPERATOR OR");
        a=false; b=false; c=(a||b);
        System.out.printf("(%s || %s) = %s\n", a, b, c);
        a=false; b=true; c=(a||b);
        System.out.printf("(%s || %s) = %s\n", a, b, c);
        a=true; b=false; c=(a||b);
        System.out.printf("(%s || %s) = %s\n", a, b, c);
        a=true; b=true; c=(a||b);
        System.out.printf("(%s || %s) = %s\n\n", a, b, c);

        //AND &&
        System.out.println("OPERATOR AND");
        a=false; b=false; c=(a&&b);
        System.out.printf("(%s && %s) = %s\n", a, b, c);
        a=false; b=true; c=(a&&b);
        System.out.printf("(%s && %s) = %s\n", a, b, c);
        a=true; b=false; c=(a&&b);
        System.out.printf("(%s && %s) = %s\n", a, b, c);
        a=true; b=true; c=(a&&b);
        System.out.printf("(%s && %s) = %s\n\n", a, b, c);
        
        //XOR ^
        System.out.println("OPERATOR XOR");
        a=false; b=false; c=(a^b);
        System.out.printf("(%s ^ %s) = %s\n", a, b, c);
        a=false; b=true; c=(a^b);
        System.out.printf("(%s ^ %s) = %s\n", a, b, c);
        a=true; b=false; c=(a^b);
        System.out.printf("(%s ^ %s) = %s\n", a, b, c);
        a=true; b=true; c=(a^b);
        System.out.printf("(%s ^ %s) = %s\n\n", a, b, c);

        //OR ||
        System.out.println("OPERATOR NOT");
        a=false; b=!a;
        System.out.printf("(!%s) = %s\n", a, b);
        a=true; b=!a;
        System.out.printf("(!%s) = %s\n\n", a, b);        
    }
    
}