package com.example.demo2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        int mat, fiz, kim, tr, tar, muz;
        Scanner inp = new Scanner(System.in);


        System.out.print("Matematik Notun: ");
        mat = inp.nextInt();

        System.out.print("Fizik Notun: ");
        fiz = inp.nextInt();

        System.out.print("Kimya Notun: ");
        kim = inp.nextInt();

        System.out.print("Turkce Notun: ");
        tr = inp.nextInt();

        System.out.print("Tarih Notun: ");
        tar = inp.nextInt();

        System.out.print("Muzik Notun: ");
        muz = inp.nextInt();


        int toplam = (mat+fiz+kim+tr+tar+muz);
        double ort;
        ort = (toplam/6.0);
        System.out.println("Ortalaman: " + ort);

        
        boolean gecti = ort >= 60;
        String str = gecti ? "Gecti":"Kaldi";
        System.out.println(str);

    }
}
