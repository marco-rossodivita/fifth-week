package com.corso.java;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        int num=0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quante stringhe vuoi inserire?");
        num = scanner.nextInt();



        InsiemeDiStringhe ins = new InsiemeDiStringhe(num);



        for(int i=0; i < ins.getMax(); i++){
            Scanner sc = new Scanner(System.in);
            System.out.println("Inserisci stringa: ");
            String s = sc.nextLine();
        }

        System.out.println("Stringa più lunga: " + ins.stringaLunga());


    }
}
