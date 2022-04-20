package com.corso.java.corsodilaurea;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Esame e = new Esame();
        e.readEsame();

        Studente s = new Studente();
        s.readStudente();
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci quanti esami dovrà sostenere lo studente nel suo piano studi");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++)
        {
            System.out.println("Inserisci il nome di un esame");
            String nomeEsame = sc.next();
            System.out.println("Inserisci il numero di crediti dell'esame");
            int crediti = sc.nextInt();
            s.aggiungiEsame(nomeEsame,crediti);
        }


    }
}

